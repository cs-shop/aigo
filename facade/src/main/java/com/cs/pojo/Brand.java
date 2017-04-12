package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer brandid;

    private String brandname;

    private String brandico;

    private Date createtime;

    private Byte brandflag;

    private String branddesc;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandico() {
        return brandico;
    }

    public void setBrandico(String brandico) {
        this.brandico = brandico;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getBrandflag() {
        return brandflag;
    }

    public void setBrandflag(Byte brandflag) {
        this.brandflag = brandflag;
    }

    public String getBranddesc() {
        return branddesc;
    }

    public void setBranddesc(String branddesc) {
        this.branddesc = branddesc;
    }
}