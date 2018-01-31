package com.google.huang.domain;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/23 0023.
 */
public class Employee implements Serializable {

    private Integer id;
    private Timestamp createTime;
    private Boolean isValid;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean valid) {
        isValid = valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", isValid=" + isValid +
                ", name='" + name + '\'' +
                '}';
    }
}
