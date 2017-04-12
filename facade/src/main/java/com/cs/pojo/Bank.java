package com.cs.pojo;

import java.io.Serializable;

public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer bankid;

    private String bankname;

    private Byte bankflag;

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public Byte getBankflag() {
        return bankflag;
    }

    public void setBankflag(Byte bankflag) {
        this.bankflag = bankflag;
    }
}