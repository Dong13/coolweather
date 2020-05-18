package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dsh on 2020/5/18.
 */

public class Province extends DataSupport {
    private Integer id;
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer code;
}
