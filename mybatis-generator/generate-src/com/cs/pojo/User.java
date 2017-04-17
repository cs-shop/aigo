package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String loginName;

    private Integer loginSecret;

    private String loginPwd;

    private Byte userSex;

    private Byte userType;

    private String userName;

    private String userQQ;

    private String userPhone;

    private String userEmail;

    private Integer userScore;

    private String userPhoto;

    private Integer userTotalScore;

    private Byte userStatus;

    private Byte userFlag;

    private Date createTime;

    private String lastIP;

    private Date lastTime;

    private Byte userFrom;

    private String openId;

    private String wxOpenId;

    private BigDecimal userMoney;

    private BigDecimal lockMoney;

    private BigDecimal distributMoney;

    private Byte isBuyer;

    private String payPwd;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getLoginSecret() {
        return loginSecret;
    }

    public void setLoginSecret(Integer loginSecret) {
        this.loginSecret = loginSecret;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Integer getUserTotalScore() {
        return userTotalScore;
    }

    public void setUserTotalScore(Integer userTotalScore) {
        this.userTotalScore = userTotalScore;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Byte getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Byte userFlag) {
        this.userFlag = userFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastIP() {
        return lastIP;
    }

    public void setLastIP(String lastIP) {
        this.lastIP = lastIP;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Byte getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(Byte userFrom) {
        this.userFrom = userFrom;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getLockMoney() {
        return lockMoney;
    }

    public void setLockMoney(BigDecimal lockMoney) {
        this.lockMoney = lockMoney;
    }

    public BigDecimal getDistributMoney() {
        return distributMoney;
    }

    public void setDistributMoney(BigDecimal distributMoney) {
        this.distributMoney = distributMoney;
    }

    public Byte getIsBuyer() {
        return isBuyer;
    }

    public void setIsBuyer(Byte isBuyer) {
        this.isBuyer = isBuyer;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }
}