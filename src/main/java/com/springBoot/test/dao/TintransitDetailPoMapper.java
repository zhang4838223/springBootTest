package com.springBoot.test.dao;

import com.springBoot.test.model.TintransitDetailPo;

public interface TintransitDetailPoMapper {
    int deleteByPrimaryKey(Long pkid);

    int insert(TintransitDetailPo record);

    int insertSelective(TintransitDetailPo record);

    TintransitDetailPo selectByPrimaryKey(Long pkid);

    int updateByPrimaryKeySelective(TintransitDetailPo record);

    int updateByPrimaryKey(TintransitDetailPo record);
}