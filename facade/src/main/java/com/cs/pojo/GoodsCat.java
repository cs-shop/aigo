package com.cs.pojo;

import java.io.Serializable;

public class GoodsCat implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer catid;

    private Integer parentid;

    private Byte isshow;

    private String catname;

    private Integer catsort;

    private Byte catflag;

    private Byte isfloor;

    private String pricesection;

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public Integer getCatsort() {
        return catsort;
    }

    public void setCatsort(Integer catsort) {
        this.catsort = catsort;
    }

    public Byte getCatflag() {
        return catflag;
    }

    public void setCatflag(Byte catflag) {
        this.catflag = catflag;
    }

    public Byte getIsfloor() {
        return isfloor;
    }

    public void setIsfloor(Byte isfloor) {
        this.isfloor = isfloor;
    }

    public String getPricesection() {
        return pricesection;
    }

    public void setPricesection(String pricesection) {
        this.pricesection = pricesection;
    }
}