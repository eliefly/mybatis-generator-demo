package com.vispractice.vacp.task.action.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vispractice.vacp.pipeline.domain.action.ReleaseImage;
import com.vispractice.vacp.pipeline.domain.action.ReleaseImageExample;

public interface IReleaseImageDao {
    int countByExample(ReleaseImageExample example);

    int deleteByExample(ReleaseImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReleaseImage record);

    int insertSelective(ReleaseImage record);

    List<ReleaseImage> selectByExample(ReleaseImageExample example);

    ReleaseImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReleaseImage record, @Param("example") ReleaseImageExample example);

    int updateByExample(@Param("record") ReleaseImage record, @Param("example") ReleaseImageExample example);

    int updateByPrimaryKeySelective(ReleaseImage record);

    int updateByPrimaryKey(ReleaseImage record);
}