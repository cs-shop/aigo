package com.cs.pojo;

import java.io.Serializable;

public class Area implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer areaid;

    private Integer parentid;

    private String areaname;

    private Byte isshow;

    private Integer areasort;

    private String areakey;

    private Byte areatype;

    private Byte areaflag;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public Integer getAreasort() {
        return areasort;
    }

    public void setAreasort(Integer areasort) {
        this.areasort = areasort;
    }

    public String getAreakey() {
        return areakey;
    }

    public void setAreakey(String areakey) {
        this.areakey = areakey;
    }

    public Byte getAreatype() {
        return areatype;
    }

    public void setAreatype(Byte areatype) {
        this.areatype = areatype;
    }

    public Byte getAreaflag() {
        return areaflag;
    }

    public void setAreaflag(Byte areaflag) {
        this.areaflag = areaflag;
    }
}