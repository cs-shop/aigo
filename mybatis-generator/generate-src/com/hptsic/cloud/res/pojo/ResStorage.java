package com.hptsic.cloud.res.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResStorage implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 存储资源ID
     */
    private String resStorageSid;

    /**
     * 所属资源池ID
     */
    private String resPoolSid;

    private String resStorageClassSid;

    /**
     * 所属存储设备
     */
    private String resEquipStorageSid;

    private String powerClusterName;

    /**
     * 存储名称
     */
    private String storageName;

    /**
     * 存储类型
     */
    private String storageType;

    /**
     * 存储标签
     */
    private String storageTag;

    /**
     * 存储逻辑单元号
     */
    private String storageUnitNo;

    /**
     * 总容量
     */
    private Float totalCapacity;

    private Long provisionedCapacity;

    /**
     * 可用容量(G)
     */
    private Float availableCapacity;

    /**
     * 硬盘类型
     */
    private String hardDiskType;

    /**
     * 存储类别
     */
    private String storageCategory;

    /**
     * 存储用途
     */
    private String storagePurpose;

    private String lunNo;

    /**
     * 状态
     */
    private String status;

    private String uuid;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdDt;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedDt;

    /**
     * 版本号
     */
    private Long version;

    /**
     * @return 存储资源ID
     */
    public String getResStorageSid() {
        return resStorageSid;
    }

    /**
     * @param resStorageSid 
	 *            存储资源ID
     */
    public void setResStorageSid(String resStorageSid) {
        this.resStorageSid = resStorageSid;
    }

    /**
     * @return 所属资源池ID
     */
    public String getResPoolSid() {
        return resPoolSid;
    }

    /**
     * @param resPoolSid 
	 *            所属资源池ID
     */
    public void setResPoolSid(String resPoolSid) {
        this.resPoolSid = resPoolSid;
    }

    public String getResStorageClassSid() {
        return resStorageClassSid;
    }

    public void setResStorageClassSid(String resStorageClassSid) {
        this.resStorageClassSid = resStorageClassSid;
    }

    /**
     * @return 所属存储设备
     */
    public String getResEquipStorageSid() {
        return resEquipStorageSid;
    }

    /**
     * @param resEquipStorageSid 
	 *            所属存储设备
     */
    public void setResEquipStorageSid(String resEquipStorageSid) {
        this.resEquipStorageSid = resEquipStorageSid;
    }

    public String getPowerClusterName() {
        return powerClusterName;
    }

    public void setPowerClusterName(String powerClusterName) {
        this.powerClusterName = powerClusterName;
    }

    /**
     * @return 存储名称
     */
    public String getStorageName() {
        return storageName;
    }

    /**
     * @param storageName 
	 *            存储名称
     */
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    /**
     * @return 存储类型
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * @param storageType 
	 *            存储类型
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * @return 存储标签
     */
    public String getStorageTag() {
        return storageTag;
    }

    /**
     * @param storageTag 
	 *            存储标签
     */
    public void setStorageTag(String storageTag) {
        this.storageTag = storageTag;
    }

    /**
     * @return 存储逻辑单元号
     */
    public String getStorageUnitNo() {
        return storageUnitNo;
    }

    /**
     * @param storageUnitNo 
	 *            存储逻辑单元号
     */
    public void setStorageUnitNo(String storageUnitNo) {
        this.storageUnitNo = storageUnitNo;
    }

    /**
     * @return 总容量
     */
    public Float getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * @param totalCapacity 
	 *            总容量
     */
    public void setTotalCapacity(Float totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Long getProvisionedCapacity() {
        return provisionedCapacity;
    }

    public void setProvisionedCapacity(Long provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
    }

    /**
     * @return 可用容量(G)
     */
    public Float getAvailableCapacity() {
        return availableCapacity;
    }

    /**
     * @param availableCapacity 
	 *            可用容量(G)
     */
    public void setAvailableCapacity(Float availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * @return 硬盘类型
     */
    public String getHardDiskType() {
        return hardDiskType;
    }

    /**
     * @param hardDiskType 
	 *            硬盘类型
     */
    public void setHardDiskType(String hardDiskType) {
        this.hardDiskType = hardDiskType;
    }

    /**
     * @return 存储类别
     */
    public String getStorageCategory() {
        return storageCategory;
    }

    /**
     * @param storageCategory 
	 *            存储类别
     */
    public void setStorageCategory(String storageCategory) {
        this.storageCategory = storageCategory;
    }

    /**
     * @return 存储用途
     */
    public String getStoragePurpose() {
        return storagePurpose;
    }

    /**
     * @param storagePurpose 
	 *            存储用途
     */
    public void setStoragePurpose(String storagePurpose) {
        this.storagePurpose = storagePurpose;
    }

    public String getLunNo() {
        return lunNo;
    }

    public void setLunNo(String lunNo) {
        this.lunNo = lunNo;
    }

    /**
     * @return 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
	 *            状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy 
	 *            创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return 创建时间
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * @param createdDt 
	 *            创建时间
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * @return 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy 
	 *            更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return 更新时间
     */
    public Date getUpdatedDt() {
        return updatedDt;
    }

    /**
     * @param updatedDt 
	 *            更新时间
     */
    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    /**
     * @return 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version 
	 *            版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}