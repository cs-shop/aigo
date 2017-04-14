package com.hptsic.cloud.sys.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResVd implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 资源磁盘ID
     */
    private String resVdSid;

    /**
     * 磁盘名称
     */
    private String vdName;

    /**
     * 占用存储大小
     */
    private Long allocateDiskSize;

    /**
     * 实际使用存储大小
     */
    private Long useDiskSize;

    /**
     * 分配存储资源ID
     */
    private String allocateResStorageSid;

    /**
     * 关联主机实例SID
     */
    private String resVmSid;

    /**
     * 块存储用途
     */
    private String storagePurpose;

    /**
     * 设备名称
     */
    private String deviceName;

    private String devicePath;

    /**
     * 磁盘模式
     */
    private String diskMode;

    private String mountPoint;

    private String fileSystemType;

    private String logicVolume;

    /**
     * UUID
     */
    private String uuid;

    /**
     * 状态
     */
    private String status;

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
     * @return 资源磁盘ID
     */
    public String getResVdSid() {
        return resVdSid;
    }

    /**
     * @param resVdSid 
	 *            资源磁盘ID
     */
    public void setResVdSid(String resVdSid) {
        this.resVdSid = resVdSid;
    }

    /**
     * @return 磁盘名称
     */
    public String getVdName() {
        return vdName;
    }

    /**
     * @param vdName 
	 *            磁盘名称
     */
    public void setVdName(String vdName) {
        this.vdName = vdName;
    }

    /**
     * @return 占用存储大小
     */
    public Long getAllocateDiskSize() {
        return allocateDiskSize;
    }

    /**
     * @param allocateDiskSize 
	 *            占用存储大小
     */
    public void setAllocateDiskSize(Long allocateDiskSize) {
        this.allocateDiskSize = allocateDiskSize;
    }

    /**
     * @return 实际使用存储大小
     */
    public Long getUseDiskSize() {
        return useDiskSize;
    }

    /**
     * @param useDiskSize 
	 *            实际使用存储大小
     */
    public void setUseDiskSize(Long useDiskSize) {
        this.useDiskSize = useDiskSize;
    }

    /**
     * @return 分配存储资源ID
     */
    public String getAllocateResStorageSid() {
        return allocateResStorageSid;
    }

    /**
     * @param allocateResStorageSid 
	 *            分配存储资源ID
     */
    public void setAllocateResStorageSid(String allocateResStorageSid) {
        this.allocateResStorageSid = allocateResStorageSid;
    }

    /**
     * @return 关联主机实例SID
     */
    public String getResVmSid() {
        return resVmSid;
    }

    /**
     * @param resVmSid 
	 *            关联主机实例SID
     */
    public void setResVmSid(String resVmSid) {
        this.resVmSid = resVmSid;
    }

    /**
     * @return 块存储用途
     */
    public String getStoragePurpose() {
        return storagePurpose;
    }

    /**
     * @param storagePurpose 
	 *            块存储用途
     */
    public void setStoragePurpose(String storagePurpose) {
        this.storagePurpose = storagePurpose;
    }

    /**
     * @return 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName 
	 *            设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    /**
     * @return 磁盘模式
     */
    public String getDiskMode() {
        return diskMode;
    }

    /**
     * @param diskMode 
	 *            磁盘模式
     */
    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    public String getFileSystemType() {
        return fileSystemType;
    }

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    public String getLogicVolume() {
        return logicVolume;
    }

    public void setLogicVolume(String logicVolume) {
        this.logicVolume = logicVolume;
    }

    /**
     * @return UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 
	 *            UUID
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
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