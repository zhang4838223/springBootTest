package com.springBoot.test.controller;

import com.springBoot.test.comm.utils.HttpUtil;
import com.springBoot.test.comm.utils.TextUtils;
import com.springBoot.test.model.BatchStockRepairPo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaojun.zhang1 on 2017/7/24.
 */
@Controller//注意，这里使用RestController注解的时候，模板无法生效
@RequestMapping("/repair")
public class DataRepairController {

    private final static String CONTRACT_INFO = "Feature.Zhaogang.InventoryBatch.Application.Contracts.Contract.RepairUnRelatedBatchStockContract";
    private final static String TEST_URL = "http://batchinventory.supplierchain.application.zhaogangtest.com/api";

    @RequestMapping("/index")
    public String toRepair(){
        return "dataRepair";//需要在默认的模板文件夹src/main/resources/templates/目录下添加一个模板文件dataRepair.ftl
    }

    @RequestMapping("/batchStock")
    @ResponseBody
    public String repairBatchStock( BatchStockRepairPo batchStockRepairPo){
//        String result = HttpUtil.httpPostByCatchException(TEST_URL, TextUtils.toJson(batchStockRepairPo), CONTRACT_INFO);
        System.out.println(batchStockRepairPo);
        return "SUCC";//需要在默认的模板文件夹src/main/resources/templates/目录下添加一个模板文件dataRepair.ftl
    }
}
