package com.dingdang.web.controller;

import com.dingdang.employee.pojo.HrEmployee;
import com.dingdang.login.pojo.HrManager;
import com.dingdang.web.feign.EmployeeFeign;
import com.dingdang.web.feign.LoginServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author py
 * @create 2019-09-16 19:34
 **/
@Controller
public class LoginController {
    @Autowired
    LoginServiceFeign loginServiceFeign;

    @Autowired
    EmployeeFeign employeeFeign;

    @RequestMapping("/loginin")
    public String dologin(String account, String pwd, HttpSession session) {
        HrManager hrManager = loginServiceFeign.dologin(account, pwd);
session.setAttribute("manager",hrManager);
        if (hrManager != null) {
            System.out.println(account + "::" + pwd);
            HrEmployee hrEmployee = employeeFeign.findByAccount(account);
            session.setAttribute("emp", hrEmployee);
            return "index";

        } else {
            return "login";
        }
    }

    @RequestMapping("/registr")
    public String addManager(HrManager hrManager) {
        hrManager.setLogintime(new Date());
        loginServiceFeign.addManager(hrManager);
        return "index";
    }
    @RequestMapping("/deletemanager")
    public String deleteManager(Integer id){
        System.out.println(id);
        loginServiceFeign.deleteManager(id);
        return "redirect:/getAll";
    }
    @ResponseBody
    @RequestMapping("/password")
    public Map password(String pwd,String password,String repassword, HttpSession session){
        System.out.println("a");
        Map map = new HashMap();
        HrManager hrManager= (HrManager) session.getAttribute("manager");
        if(hrManager.getPassword().equals(pwd)){
            if (!password.equals(repassword)){
                map.put("code",500);
                map.put("msg","两次输入密码不一致！");
                return map;
            }
            map.put("code",200);
            return map;
        }else{
            map.put("code",500);
            map.put("msg","原密码错误！");
            return map;
        }
    }

    @RequestMapping("/updateManager")
    public String updateManager(HrManager hrManager){
        System.out.println(hrManager.getAccount());
        loginServiceFeign.updateManager(hrManager);
        return "index";
    }

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<HrManager> list=loginServiceFeign.getAll();
        model.addAttribute("list",list);
        return "managerfind";
    }
    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("manager");
        session.removeAttribute("emp");
        return "redirect:/";
    }
    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/{page}")
    public String login(@PathVariable String page) {
        return page;
    }

}
