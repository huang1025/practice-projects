package com.huang.base.dto;

import com.huang.base.dto.validate.groups.FirstGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;

/**
 * Created by huang on 2017/5/31.
 */
public class Work {

    @NotBlank(message = "工作名称不能为空;", groups = {FirstGroup.class})
    String name;

    @Min(value = 1, message = "工作时长不得小于1;")
    int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
