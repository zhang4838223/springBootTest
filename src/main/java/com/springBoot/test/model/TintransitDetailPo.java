package com.springBoot.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class TintransitDetailPo {
    private Long pkid;

    private String intraDetailCode;

    private String intransitCode;

    private Long intransitItemId;

    private String billCode;

    private String logisticsNum;

    private Short shipType;

    private String shipLocation;

    private String termini;

    private Long warehouseId;

    private String warehouseArea;

    private BigDecimal transportWeight;

    private Date completeDate;

    private Short intraDetailStatus;

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

    public String getIntraDetailCode() {
        return intraDetailCode;
    }

    public void setIntraDetailCode(String intraDetailCode) {
        this.intraDetailCode = intraDetailCode == null ? null : intraDetailCode.trim();
    }

    public String getIntransitCode() {
        return intransitCode;
    }

    public void setIntransitCode(String intransitCode) {
        this.intransitCode = intransitCode == null ? null : intransitCode.trim();
    }

    public Long getIntransitItemId() {
        return intransitItemId;
    }

    public void setIntransitItemId(Long intransitItemId) {
        this.intransitItemId = intransitItemId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    public Short getShipType() {
        return shipType;
    }

    public void setShipType(Short shipType) {
        this.shipType = shipType;
    }

    public String getShipLocation() {
        return shipLocation;
    }

    public void setShipLocation(String shipLocation) {
        this.shipLocation = shipLocation == null ? null : shipLocation.trim();
    }

    public String getTermini() {
        return termini;
    }

    public void setTermini(String termini) {
        this.termini = termini == null ? null : termini.trim();
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

    public BigDecimal getTransportWeight() {
        return transportWeight;
    }

    public void setTransportWeight(BigDecimal transportWeight) {
        this.transportWeight = transportWeight;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Short getIntraDetailStatus() {
        return intraDetailStatus;
    }

    public void setIntraDetailStatus(Short intraDetailStatus) {
        this.intraDetailStatus = intraDetailStatus;
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