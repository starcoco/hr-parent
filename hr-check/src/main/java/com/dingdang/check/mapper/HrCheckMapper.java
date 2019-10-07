package com.dingdang.check.mapper;

import com.dingdang.check.pojo.HrCheck;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HrCheckMapper {
    List<HrCheck> selectAll();

    int deleteByPrimaryKey(Integer chId);

    int insert(HrCheck record);

    int updateByPrimaryKey(HrCheck record);
}