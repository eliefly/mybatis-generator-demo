package com.vispractice.vacp.task.action.dao;

import com.vispractice.vacp.pipeline.domain.action.ReleaseImageInstance;
import com.vispractice.vacp.pipeline.domain.action.ReleaseImageInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IReleaseImageInstanceDao {
    int countByExample(ReleaseImageInstanceExample example);

    int deleteByExample(ReleaseImageInstanceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReleaseImageInstance record);

    int insertSelective(ReleaseImageInstance record);

    List<ReleaseImageInstance> selectByExample(ReleaseImageInstanceExample example);

    ReleaseImageInstance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReleaseImageInstance record, @Param("example") ReleaseImageInstanceExample example);

    int updateByExample(@Param("record") ReleaseImageInstance record, @Param("example") ReleaseImageInstanceExample example);

    int updateByPrimaryKeySelective(ReleaseImageInstance record);

    int updateByPrimaryKey(ReleaseImageInstance record);
}