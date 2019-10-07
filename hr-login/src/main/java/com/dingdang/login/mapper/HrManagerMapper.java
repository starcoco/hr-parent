package com.dingdang.login.mapper;

import com.dingdang.login.pojo.HrManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author py
 * @create 2019-09-16 16:44
 **/
@Mapper
public interface HrManagerMapper {
    public HrManager dologin(@Param("account") String account,@Param("pwd") String pwd);
    public void addManager( HrManager hrManager);
    public void deleteManager(Integer id);
    public void updateManager(HrManager hrManager);
    public HrManager getByAccount(String account);
    public List<HrManager> getAll();
}
