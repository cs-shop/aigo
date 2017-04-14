package com.hptsic.cloud.res.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResVe implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 资源拓扑结构ID
     */
    private String resVeSid;

    /**
     * 资源环境sid
     */
    private String resParentTopologySid;

    private String resVeName;

    /**
     * 虚拟平台类型
     */
    private String virtualPlatformType;

    /**
     * 虚拟平台版本
     */
    private String virtualPlatformVersion;

    /**
     * 管理地址
     */
    private String managementUrl;

    /**
     * 管理用户帐号
     */
    private String managementAccount;

    /**
     * 管理用户密码
     */
    private String managementPassword;

    /**
     * 连接状态
     */
    private String connectStatus;

    /**
     * 更新状态
     */
    private String updateStatus;

    /**
     * 更新周期
     */
    private String updateCycle;

    /**
     * 更新时间
     */
    private Date updateTime;

    private String taskId;

    /**
     * @return 资源拓扑结构ID
     */
    public String getResVeSid() {
        return resVeSid;
    }

    /**
     * @param resVeSid 
	 *            资源拓扑结构ID
     */
    public void setResVeSid(String resVeSid) {
        this.resVeSid = resVeSid;
    }

    /**
     * @return 资源环境sid
     */
    public String getResParentTopologySid() {
        return resParentTopologySid;
    }

    /**
     * @param resParentTopologySid 
	 *            资源环境sid
     */
    public void setResParentTopologySid(String resParentTopologySid) {
        this.resParentTopologySid = resParentTopologySid;
    }

    public String getResVeName() {
        return resVeName;
    }

    public void setResVeName(String resVeName) {
        this.resVeName = resVeName;
    }

    /**
     * @return 虚拟平台类型
     */
    public String getVirtualPlatformType() {
        return virtualPlatformType;
    }

    /**
     * @param virtualPlatformType 
	 *            虚拟平台类型
     */
    public void setVirtualPlatformType(String virtualPlatformType) {
        this.virtualPlatformType = virtualPlatformType;
    }

    /**
     * @return 虚拟平台版本
     */
    public String getVirtualPlatformVersion() {
        return virtualPlatformVersion;
    }

    /**
     * @param virtualPlatformVersion 
	 *            虚拟平台版本
     */
    public void setVirtualPlatformVersion(String virtualPlatformVersion) {
        this.virtualPlatformVersion = virtualPlatformVersion;
    }

    /**
     * @return 管理地址
     */
    public String getManagementUrl() {
        return managementUrl;
    }

    /**
     * @param managementUrl 
	 *            管理地址
     */
    public void setManagementUrl(String managementUrl) {
        this.managementUrl = managementUrl;
    }

    /**
     * @return 管理用户帐号
     */
    public String getManagementAccount() {
        return managementAccount;
    }

    /**
     * @param managementAccount 
	 *            管理用户帐号
     */
    public void setManagementAccount(String managementAccount) {
        this.managementAccount = managementAccount;
    }

    /**
     * @return 管理用户密码
     */
    public String getManagementPassword() {
        return managementPassword;
    }

    /**
     * @param managementPassword 
	 *            管理用户密码
     */
    public void setManagementPassword(String managementPassword) {
        this.managementPassword = managementPassword;
    }

    /**
     * @return 连接状态
     */
    public String getConnectStatus() {
        return connectStatus;
    }

    /**
     * @param connectStatus 
	 *            连接状态
     */
    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
    }

    /**
     * @return 更新状态
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    /**
     * @param updateStatus 
	 *            更新状态
     */
    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * @return 更新周期
     */
    public String getUpdateCycle() {
        return updateCycle;
    }

    /**
     * @param updateCycle 
	 *            更新周期
     */
    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }

    /**
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime 
	 *            更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}