package com.cs.pojo;

import java.io.Serializable;

public class FeedbackWithBLOBs extends Feedback implements Serializable {
    private static final long serialVersionUID = 1L;

    private String content;

    private String adminreply;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAdminreply() {
        return adminreply;
    }

    public void setAdminreply(String adminreply) {
        this.adminreply = adminreply;
    }
}