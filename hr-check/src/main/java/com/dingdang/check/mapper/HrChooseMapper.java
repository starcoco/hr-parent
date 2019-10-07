package com.dingdang.check.mapper;

import com.dingdang.check.pojo.HrChoose;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HrChooseMapper {

    int deleteByPrimaryKey(Integer coId);

    int insert(HrChoose record);

    List<HrChoose> selectByType();

    int updateByPrimaryKey(HrChoose record);
}