package com.springBoot.test.model;

import java.util.Date;

public class TintransitPo {
    private Long pkid;

    private String intransitCode;

    private Long contractId;

    private String contractOutCode;

    private Short intransitStatus;

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

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getContractOutCode() {
        return contractOutCode;
    }

    public void setContractOutCode(String contractOutCode) {
        this.contractOutCode = contractOutCode == null ? null : contractOutCode.trim();
    }

    public Short getIntransitStatus() {
        return intransitStatus;
    }

    public void setIntransitStatus(Short intransitStatus) {
        this.intransitStatus = intransitStatus;
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