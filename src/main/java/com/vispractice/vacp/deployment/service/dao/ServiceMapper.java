package com.vispractice.vacp.deployment.service.dao;

import com.vispractice.vacp.deployment.service.domain.Service;
import com.vispractice.vacp.deployment.service.domain.ServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceMapper {
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}