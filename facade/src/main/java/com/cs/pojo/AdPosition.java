package com.cs.pojo;

import java.io.Serializable;

public class AdPosition implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer positionid;

    private Byte positiontype;

    private String positionname;

    private Integer positionwidth;

    private Integer positionheight;

    private Byte positionflag;

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Byte getPositiontype() {
        return positiontype;
    }

    public void setPositiontype(Byte positiontype) {
        this.positiontype = positiontype;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public Integer getPositionwidth() {
        return positionwidth;
    }

    public void setPositionwidth(Integer positionwidth) {
        this.positionwidth = positionwidth;
    }

    public Integer getPositionheight() {
        return positionheight;
    }

    public void setPositionheight(Integer positionheight) {
        this.positionheight = positionheight;
    }

    public Byte getPositionflag() {
        return positionflag;
    }

    public void setPositionflag(Byte positionflag) {
        this.positionflag = positionflag;
    }
}