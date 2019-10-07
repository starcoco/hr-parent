package com.dingdang.check.mapper;

import com.dingdang.check.pojo.HrChsum;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface HrChsumMapper {
    List<HrChsum> selectAll();

    int deleteByPrimaryKey(Integer sId);

    int insert(HrChsum record);

    HrChsum selectByPrimaryKey(Integer sId);

    int updateByPrimaryKey(HrChsum record);
}