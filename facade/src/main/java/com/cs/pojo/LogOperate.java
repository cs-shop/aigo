package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogOperate implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer operateid;

    private Integer staffid;

    private Date operatetime;

    private String module;

    private String operateuri;

    private String content;

    public Integer getOperateid() {
        return operateid;
    }

    public void setOperateid(Integer operateid) {
        this.operateid = operateid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOperateuri() {
        return operateuri;
    }

    public void setOperateuri(String operateuri) {
        this.operateuri = operateuri;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}