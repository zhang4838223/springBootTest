package com.springBoot.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class TintransitItemPo {
    private Long pkid;

    private String intransitCode;

    private Short intransitType;

    private Date proposeDate;

    private BigDecimal contractWeight;

    private BigDecimal proposeCost;

    private BigDecimal actualWeight;

    private BigDecimal estinateCost;

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

    public String getIntransitCode() {
        return intransitCode;
    }

    public void setIntransitCode(String intransitCode) {
        this.intransitCode = intransitCode == null ? null : intransitCode.trim();
    }

    public Short getIntransitType() {
        return intransitType;
    }

    public void setIntransitType(Short intransitType) {
        this.intransitType = intransitType;
    }

    public Date getProposeDate() {
        return proposeDate;
    }

    public void setProposeDate(Date proposeDate) {
        this.proposeDate = proposeDate;
    }

    public BigDecimal getContractWeight() {
        return contractWeight;
    }

    public void setContractWeight(BigDecimal contractWeight) {
        this.contractWeight = contractWeight;
    }

    public BigDecimal getProposeCost() {
        return proposeCost;
    }

    public void setProposeCost(BigDecimal proposeCost) {
        this.proposeCost = proposeCost;
    }

    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(BigDecimal actualWeight) {
        this.actualWeight = actualWeight;
    }

    public BigDecimal getEstinateCost() {
        return estinateCost;
    }

    public void setEstinateCost(BigDecimal estinateCost) {
        this.estinateCost = estinateCost;
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