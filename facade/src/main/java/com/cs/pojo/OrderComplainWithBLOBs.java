package com.cs.pojo;

import java.io.Serializable;

public class OrderComplainWithBLOBs extends OrderComplain implements Serializable {
    private static final long serialVersionUID = 1L;

    private String complaincontent;

    private String respondcontent;

    private String finalresult;

    public String getComplaincontent() {
        return complaincontent;
    }

    public void setComplaincontent(String complaincontent) {
        this.complaincontent = complaincontent;
    }

    public String getRespondcontent() {
        return respondcontent;
    }

    public void setRespondcontent(String respondcontent) {
        this.respondcontent = respondcontent;
    }

    public String getFinalresult() {
        return finalresult;
    }

    public void setFinalresult(String finalresult) {
        this.finalresult = finalresult;
    }
}