package com.cs.pojo;

import java.io.Serializable;

public class PaymentsWithBLOBs extends Payments implements Serializable {
    private static final long serialVersionUID = 1L;

    private String paydesc;

    private String payconfig;

    public String getPaydesc() {
        return paydesc;
    }

    public void setPaydesc(String paydesc) {
        this.paydesc = paydesc;
    }

    public String getPayconfig() {
        return payconfig;
    }

    public void setPayconfig(String payconfig) {
        this.payconfig = payconfig;
    }
}