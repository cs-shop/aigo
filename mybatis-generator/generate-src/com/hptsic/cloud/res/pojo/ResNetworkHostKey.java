package com.hptsic.cloud.res.pojo;

import java.io.Serializable;

public class ResNetworkHostKey implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主机sid
     */
    private String resHostSid;

    /**
     * 网络Sid
     */
    private String resNetworkSid;

    /**
     * @return 主机sid
     */
    public String getResHostSid() {
        return resHostSid;
    }

    /**
     * @param resHostSid 
	 *            主机sid
     */
    public void setResHostSid(String resHostSid) {
        this.resHostSid = resHostSid;
    }

    /**
     * @return 网络Sid
     */
    public String getResNetworkSid() {
        return resNetworkSid;
    }

    /**
     * @param resNetworkSid 
	 *            网络Sid
     */
    public void setResNetworkSid(String resNetworkSid) {
        this.resNetworkSid = resNetworkSid;
    }
}