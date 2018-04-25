package com.jiang.autowired;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by huang_jiangling on 2018/4/10.
 */
@Component
@Data
class CircleDenpendenceB {

    @Autowired
    private CircleDenpendenceA circleDenpendenceA;

    private String name = "B";
}
