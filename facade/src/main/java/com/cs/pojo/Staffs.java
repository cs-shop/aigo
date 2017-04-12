package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Staffs implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer staffid;

    private String loginname;

    private String loginpwd;

    private Integer secretkey;

    private String staffname;

    private String staffno;

    private String staffphoto;

    private Integer staffroleid;

    private Byte workstatus;

    private Byte staffstatus;

    private Byte staffflag;

    private Date createtime;

    private Date lasttime;

    private String lastip;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public Integer getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(Integer secretkey) {
        this.secretkey = secretkey;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno;
    }

    public String getStaffphoto() {
        return staffphoto;
    }

    public void setStaffphoto(String staffphoto) {
        this.staffphoto = staffphoto;
    }

    public Integer getStaffroleid() {
        return staffroleid;
    }

    public void setStaffroleid(Integer staffroleid) {
        this.staffroleid = staffroleid;
    }

    public Byte getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(Byte workstatus) {
        this.workstatus = workstatus;
    }

    public Byte getStaffstatus() {
        return staffstatus;
    }

    public void setStaffstatus(Byte staffstatus) {
        this.staffstatus = staffstatus;
    }

    public Byte getStaffflag() {
        return staffflag;
    }

    public void setStaffflag(Byte staffflag) {
        this.staffflag = staffflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }
}