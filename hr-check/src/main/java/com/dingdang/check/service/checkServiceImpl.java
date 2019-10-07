package com.dingdang.check.service;

import com.dingdang.check.mapper.HrCheckMapper;
import com.dingdang.check.mapper.HrChooseMapper;
import com.dingdang.check.mapper.HrChsumMapper;
import com.dingdang.check.pojo.HrCheck;
import com.dingdang.check.pojo.HrChoose;
import com.dingdang.check.pojo.HrChsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author py
 * @create 2019-10-03 18:56
 **/
@RestController
public class checkServiceImpl implements checkService {
    @Autowired
    HrCheckMapper hrCheckMapper;

    @Autowired
    HrChsumMapper hrChsumMapper;

    @Autowired
    HrChooseMapper hrChooseMapper;

    @Override
    public List<HrCheck> selectAllCheck() {
        List<HrCheck> list=hrCheckMapper.selectAll();
        return list;
    }

    @Override
    public int deleteByCheckKey(@RequestParam("chId") Integer chId) {
        int count=hrCheckMapper.deleteByPrimaryKey(chId);
        return count;
    }

    @Override
    public int insertCheck(@RequestBody HrCheck record) {
        int count=hrCheckMapper.insert(record);
        return count;
    }

    @Override
    public int updateByCheckKey(@RequestBody HrCheck record) {
        int count=hrCheckMapper.updateByPrimaryKey(record);
        return count;
    }
    @Override
    public List<HrChsum> selectAllSum() {
        List<HrChsum> list= hrChsumMapper.selectAll();
        return list;
    }

    @Override
    public int deleteBySumKey(Integer sId) {
        int count=hrChsumMapper.deleteByPrimaryKey(sId);
        return count;
    }

    @Override
    public int insertsum(HrChsum record) {
        int count=hrChsumMapper.insert(record);
        return count;
    }

    @Override
    public HrChsum selectbysum(Integer sId) {
        HrChsum hrChsum=hrChsumMapper.selectByPrimaryKey(sId);
        return hrChsum;
    }

    @Override
    public int updatesumby(@RequestBody HrChsum record) {
        int count=hrChsumMapper.updateByPrimaryKey(record);
        return count;
    }

    @Override
    public int deleteByChooseKey(Integer coId) {
        return 0;
    }

    @Override
    public int insertchoose(HrChoose record) {
        return 0;
    }

    @Override
    public List<HrChoose> selectByType() {
        List<HrChoose> list=hrChooseMapper.selectByType();
        return list;
    }

    @Override
    public int updatechoose(HrChoose record) {
        int count=hrChooseMapper.updateByPrimaryKey(record);
        return count;
    }
}
