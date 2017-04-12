package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class AttributeCat implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer catid;

    private Integer shopid;

    private String catname;

    private Byte catflag;

    private Date createtime;

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public Byte getCatflag() {
        return catflag;
    }

    public void setCatflag(Byte catflag) {
        this.catflag = catflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}