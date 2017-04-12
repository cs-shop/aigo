package com.cs.pojo;

import java.io.Serializable;

public class Payments implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String paycode;

    private String payname;

    private Integer payorder;

    private Byte enabled;

    private Byte isonline;

    private String payfor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname;
    }

    public Integer getPayorder() {
        return payorder;
    }

    public void setPayorder(Integer payorder) {
        this.payorder = payorder;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Byte getIsonline() {
        return isonline;
    }

    public void setIsonline(Byte isonline) {
        this.isonline = isonline;
    }

    public String getPayfor() {
        return payfor;
    }

    public void setPayfor(String payfor) {
        this.payfor = payfor;
    }
}