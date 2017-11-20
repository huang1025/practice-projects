package com.huang.mybatis.dto;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by huang_jiangling on 2017/11/14.
 */
@Getter
@Setter
public class Department {

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    private String id;
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
