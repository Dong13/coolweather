package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dsh on 2020/5/18.
 */

public class City extends DataSupport {
    private Integer id;
    private String name;
    private Integer code;
    private Integer provinceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}
