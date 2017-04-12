package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Attribute implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer attrid;

    private Integer shopid;

    private Integer catid;

    private String attrname;

    private Byte attrtype;

    private Byte ispriceattr;

    private Byte attrflag;

    private Integer attrsort;

    private Date createtime;

    private String attrcontent;

    public Integer getAttrid() {
        return attrid;
    }

    public void setAttrid(Integer attrid) {
        this.attrid = attrid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public String getAttrname() {
        return attrname;
    }

    public void setAttrname(String attrname) {
        this.attrname = attrname;
    }

    public Byte getAttrtype() {
        return attrtype;
    }

    public void setAttrtype(Byte attrtype) {
        this.attrtype = attrtype;
    }

    public Byte getIspriceattr() {
        return ispriceattr;
    }

    public void setIspriceattr(Byte ispriceattr) {
        this.ispriceattr = ispriceattr;
    }

    public Byte getAttrflag() {
        return attrflag;
    }

    public void setAttrflag(Byte attrflag) {
        this.attrflag = attrflag;
    }

    public Integer getAttrsort() {
        return attrsort;
    }

    public void setAttrsort(Integer attrsort) {
        this.attrsort = attrsort;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAttrcontent() {
        return attrcontent;
    }

    public void setAttrcontent(String attrcontent) {
        this.attrcontent = attrcontent;
    }
}