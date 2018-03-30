package com.springBoot.test.dao;

import com.springBoot.test.model.TintransitItemPo;

public interface TintransitItemPoMapper {
    int deleteByPrimaryKey(Long pkid);

    int insert(TintransitItemPo record);

    int insertSelective(TintransitItemPo record);

    TintransitItemPo selectByPrimaryKey(Long pkid);

    int updateByPrimaryKeySelective(TintransitItemPo record);

    int updateByPrimaryKey(TintransitItemPo record);
}