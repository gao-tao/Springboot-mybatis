package com.java.demo.entry;

import java.io.Serializable;

public class Brand implements Serializable {
    private Long id;

    private String brandName;

    private Long brandStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Long getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Long brandStatus) {
        this.brandStatus = brandStatus;
    }
}