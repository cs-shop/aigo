package com.cs.pojo;

import java.io.Serializable;

public class Orderid implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Float rnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getRnd() {
        return rnd;
    }

    public void setRnd(Float rnd) {
        this.rnd = rnd;
    }
}