package com.hptsic.cloud.res.pojo;

import java.io.Serializable;

public class ResPool implements Serializable {
    private static final long serialVersionUID = 1L;

    private String resPoolSid;

    private String resParentPoolSid;

    private String resZoneSid;

    private String type;

    private String desc;

    public String getResPoolSid() {
        return resPoolSid;
    }

    public void setResPoolSid(String resPoolSid) {
        this.resPoolSid = resPoolSid;
    }

    public String getResParentPoolSid() {
        return resParentPoolSid;
    }

    public void setResParentPoolSid(String resParentPoolSid) {
        this.resParentPoolSid = resParentPoolSid;
    }

    public String getResZoneSid() {
        return resZoneSid;
    }

    public void setResZoneSid(String resZoneSid) {
        this.resZoneSid = resZoneSid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}