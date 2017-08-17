package com.huang.creator.domain;

import com.alibaba.fastjson.JSON;
import com.huang.base.util.StringUtil;

/**
 * Created by huang_jiangling on 2017/8/16.
 */
public class FieldDto {

    private String fieldName;//字段名称；
    private String fieldType;//字段类型
    private String fieldComment;//字段注释；

    private String column;//对应表名；

    public FieldDto(String fieldName, String fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.column = StringUtil.addUnderLine(fieldName);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
