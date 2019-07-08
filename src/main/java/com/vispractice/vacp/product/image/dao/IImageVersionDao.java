package com.vispractice.vacp.product.image.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vispractice.vacp.product.domain.image.ImageVersion;
import com.vispractice.vacp.product.domain.image.ImageVersionExample;

public interface IImageVersionDao {
    int countByExample(ImageVersionExample example);

    int deleteByExample(ImageVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImageVersion record);

    int insertSelective(ImageVersion record);

    List<ImageVersion> selectByExample(ImageVersionExample example);

    ImageVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImageVersion record, @Param("example") ImageVersionExample example);

    int updateByExample(@Param("record") ImageVersion record, @Param("example") ImageVersionExample example);

    int updateByPrimaryKeySelective(ImageVersion record);

    int updateByPrimaryKey(ImageVersion record);
}