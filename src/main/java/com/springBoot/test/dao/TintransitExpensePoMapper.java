package com.springBoot.test.dao;

import com.springBoot.test.model.TintransitExpensePo;

public interface TintransitExpensePoMapper {
    int deleteByPrimaryKey(Long pkid);

    int insert(TintransitExpensePo record);

    int insertSelective(TintransitExpensePo record);

    TintransitExpensePo selectByPrimaryKey(Long pkid);

    int updateByPrimaryKeySelective(TintransitExpensePo record);

    int updateByPrimaryKey(TintransitExpensePo record);
}