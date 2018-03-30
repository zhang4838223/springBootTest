package com.springBoot.test.dao;

import com.springBoot.test.model.TintransitPo;

public interface TintransitPoMapper {
    int deleteByPrimaryKey(Long pkid);

    int insert(TintransitPo record);

    int insertSelective(TintransitPo record);

    TintransitPo selectByPrimaryKey(Long pkid);

    int updateByPrimaryKeySelective(TintransitPo record);

    int updateByPrimaryKey(TintransitPo record);
}