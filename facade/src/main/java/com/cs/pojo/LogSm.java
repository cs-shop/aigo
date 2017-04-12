package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogSm implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer smsid;

    private Byte smssrc;

    private Integer smsuserid;

    private String smscontent;

    private String smsphonenumber;

    private String smsreturncode;

    private String smsfunc;

    private Date createtime;

    private String smscode;

    private String smsip;

    public Integer getSmsid() {
        return smsid;
    }

    public void setSmsid(Integer smsid) {
        this.smsid = smsid;
    }

    public Byte getSmssrc() {
        return smssrc;
    }

    public void setSmssrc(Byte smssrc) {
        this.smssrc = smssrc;
    }

    public Integer getSmsuserid() {
        return smsuserid;
    }

    public void setSmsuserid(Integer smsuserid) {
        this.smsuserid = smsuserid;
    }

    public String getSmscontent() {
        return smscontent;
    }

    public void setSmscontent(String smscontent) {
        this.smscontent = smscontent;
    }

    public String getSmsphonenumber() {
        return smsphonenumber;
    }

    public void setSmsphonenumber(String smsphonenumber) {
        this.smsphonenumber = smsphonenumber;
    }

    public String getSmsreturncode() {
        return smsreturncode;
    }

    public void setSmsreturncode(String smsreturncode) {
        this.smsreturncode = smsreturncode;
    }

    public String getSmsfunc() {
        return smsfunc;
    }

    public void setSmsfunc(String smsfunc) {
        this.smsfunc = smsfunc;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public String getSmsip() {
        return smsip;
    }

    public void setSmsip(String smsip) {
        this.smsip = smsip;
    }
}