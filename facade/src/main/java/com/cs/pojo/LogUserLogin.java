package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogUserLogin implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer loginid;

    private Integer userid;

    private Date logintime;

    private String loginip;

    /**
     * 0:商城  1:webapp  2:App
     */
    private Byte loginsrc;

    /**
     * 登录备注信息
     */
    private String loginremark;

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    /**
     * @return 0:商城  1:webapp  2:App
     */
    public Byte getLoginsrc() {
        return loginsrc;
    }

    /**
     * @param loginsrc 
	 *            0:商城  1:webapp  2:App
     */
    public void setLoginsrc(Byte loginsrc) {
        this.loginsrc = loginsrc;
    }

    /**
     * @return 登录备注信息
     */
    public String getLoginremark() {
        return loginremark;
    }

    /**
     * @param loginremark 
	 *            登录备注信息
     */
    public void setLoginremark(String loginremark) {
        this.loginremark = loginremark;
    }
}