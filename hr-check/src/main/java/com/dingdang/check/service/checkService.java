package com.dingdang.check.service;

import com.dingdang.check.mapper.HrCheckMapper;
import com.dingdang.check.pojo.HrCheck;
import com.dingdang.check.pojo.HrChoose;
import com.dingdang.check.pojo.HrChsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author py
 * @create 2019-10-03 18:49
 **/
@RequestMapping("/check")
public interface checkService {
    @RequestMapping("selectall")
    List<HrCheck> selectAllCheck();

    @RequestMapping("/delete")
    int deleteByCheckKey(@RequestParam("chId") Integer chId);

    @RequestMapping("/insert")
    int insertCheck(@RequestBody HrCheck record);

    @RequestMapping("/update")
    int updateByCheckKey(@RequestBody HrCheck record);

    @RequestMapping("/selectsum")
    List<HrChsum> selectAllSum();

    @RequestMapping("/deletesum")
    int deleteBySumKey(@RequestParam("sId") Integer sId);

    @RequestMapping("insertsum")
    int insertsum(@RequestBody HrChsum record);

    @RequestMapping("selectbysum")
    HrChsum selectbysum(@RequestParam("sId") Integer sId);

    @RequestMapping("/updatesumby")
    int updatesumby(@RequestBody HrChsum record);

    @RequestMapping("/deletechoose")
    int deleteByChooseKey(@RequestParam("coId") Integer coId);
@RequestMapping("/insertchoose")
    int insertchoose(@RequestBody HrChoose record);
@RequestMapping("/selectchoose")
    List<HrChoose> selectByType();
@RequestMapping("/updatechoose")
    int updatechoose(@RequestBody HrChoose record);
}
