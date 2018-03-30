package com.springBoot.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class TintransitExpensePo {
    private Long pkid;

    private String intraExpenseCode;

    private String intraDetailCode;

    private Short type;

    private String subject;

    private BigDecimal unitPrice;

    private BigDecimal taxRate;

    private BigDecimal weight;

    private BigDecimal planExpense;

    private BigDecimal predictExpense;

    private Long warehouseId;

    private String warehouseArea;

    private String transportCompany;

    private String transportCompanyId;

    private Short expenseStatus;

    private String remark;

    private String lastModifiedByName;

    private Long lastModifiedBy;

    private String lastModifiedIp;

    private Date lastModifiedTime;

    private String addedByName;

    private Long addedBy;

    private Date addedTime;

    private String valid;

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getIntraExpenseCode() {
        return intraExpenseCode;
    }

    public void setIntraExpenseCode(String intraExpenseCode) {
        this.intraExpenseCode = intraExpenseCode == null ? null : intraExpenseCode.trim();
    }

    public String getIntraDetailCode() {
        return intraDetailCode;
    }

    public void setIntraDetailCode(String intraDetailCode) {
        this.intraDetailCode = intraDetailCode == null ? null : intraDetailCode.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPlanExpense() {
        return planExpense;
    }

    public void setPlanExpense(BigDecimal planExpense) {
        this.planExpense = planExpense;
    }

    public BigDecimal getPredictExpense() {
        return predictExpense;
    }

    public void setPredictExpense(BigDecimal predictExpense) {
        this.predictExpense = predictExpense;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseArea() {
        return warehouseArea;
    }

    public void setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea == null ? null : warehouseArea.trim();
    }

    public String getTransportCompany() {
        return transportCompany;
    }

    public void setTransportCompany(String transportCompany) {
        this.transportCompany = transportCompany == null ? null : transportCompany.trim();
    }

    public String getTransportCompanyId() {
        return transportCompanyId;
    }

    public void setTransportCompanyId(String transportCompanyId) {
        this.transportCompanyId = transportCompanyId == null ? null : transportCompanyId.trim();
    }

    public Short getExpenseStatus() {
        return expenseStatus;
    }

    public void setExpenseStatus(Short expenseStatus) {
        this.expenseStatus = expenseStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLastModifiedByName() {
        return lastModifiedByName;
    }

    public void setLastModifiedByName(String lastModifiedByName) {
        this.lastModifiedByName = lastModifiedByName == null ? null : lastModifiedByName.trim();
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedIp() {
        return lastModifiedIp;
    }

    public void setLastModifiedIp(String lastModifiedIp) {
        this.lastModifiedIp = lastModifiedIp == null ? null : lastModifiedIp.trim();
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getAddedByName() {
        return addedByName;
    }

    public void setAddedByName(String addedByName) {
        this.addedByName = addedByName == null ? null : addedByName.trim();
    }

    public Long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Long addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}