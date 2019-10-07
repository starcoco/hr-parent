package com.dingdang.web.controller;

import com.dingdang.check.pojo.HrChoose;
import com.dingdang.web.feign.checkFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author py
 * @create 2019-10-03 19:58
 **/
@Controller
public class CheckController {
    @Autowired
    checkFeign checkFeign;

    @RequestMapping("/selectByType")
    public String selectByType(Model model) {
        List<HrChoose> list = checkFeign.selectByType();
        System.out.println(list.get(2).getCoOntime());
        model.addAttribute("choose", list);
        return "checkshow";
    }

    @RequestMapping("/updateByChooseId")
    @ResponseBody
    public String updateById(HrChoose record, String check) {
        if (check!=null) {
            record.setCoIsornot(0);
        }else {
            record.setCoIsornot(1);
        }
        System.out.println("c ::" + check);
        checkFeign.updatechoose(record);
        return "redirect:selectByType";
    }
}
