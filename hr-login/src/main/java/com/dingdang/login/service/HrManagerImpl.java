package com.dingdang.login.service;

import com.dingdang.login.mapper.HrManagerMapper;
import com.dingdang.login.pojo.HrManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author py
 * @create 2019-09-16 19:11
 **/
@RestController
public class HrManagerImpl implements HrManagerService {

    @Autowired
    HrManagerMapper hrManagerMapper;

    @Override
    public HrManager dologin(@RequestParam("account") String account,@RequestParam("pwd") String pwd) {
        HrManager dologin = hrManagerMapper.dologin(account,pwd);

        return dologin;
    }

    @Override
    public void addManager(@RequestBody HrManager hrManager) {
        hrManagerMapper.addManager(hrManager);
    }

    @Override
    public void deleteManager(@RequestParam("id") Integer id) {
        System.out.println(id);
        hrManagerMapper.deleteManager(id);
    }

    @Override
    public void updateManager(@RequestBody HrManager hrManager) {
        System.out.println(hrManager.getAccount());
        HrManager hrManager1=hrManagerMapper.getByAccount(hrManager.getAccount());
        System.out.println(hrManager1.getAccount());
        hrManager1.setPassword(hrManager.getPassword());
        hrManagerMapper.updateManager(hrManager1);
    }

    @Override
    public List<HrManager> getAll() {
        List<HrManager> list=hrManagerMapper.getAll();
        return list;
    }
}
