package com.dingdang.login.service;

import com.dingdang.login.pojo.HrManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author py
 * @create 2019-09-16 18:54
 **/
@RequestMapping("/login")
public interface HrManagerService {
    @RequestMapping("/dologin")
    public HrManager dologin(@RequestParam("account") String account,@RequestParam("pwd") String pwd);
    @RequestMapping("regist")
    public void addManager(@RequestBody HrManager hrManager);
    @RequestMapping("/delete")
    public void deleteManager(@RequestParam("id") Integer id);
    @RequestMapping("/update")
    public void updateManager(@RequestBody HrManager hrManager);
    @RequestMapping("/getall")
    public List<HrManager> getAll();
}
