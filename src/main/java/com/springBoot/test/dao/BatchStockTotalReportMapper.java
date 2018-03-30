package com.springBoot.test.dao;

import com.springBoot.test.model.BatchStockTotalReport;

public interface BatchStockTotalReportMapper {
    int deleteByPrimaryKey(Long pkid);

    int insert(BatchStockTotalReport record);

    int insertSelective(BatchStockTotalReport record);

    BatchStockTotalReport selectByPrimaryKey(Long pkid);

    int updateByPrimaryKeySelective(BatchStockTotalReport record);

    int updateByPrimaryKey(BatchStockTotalReport record);
}