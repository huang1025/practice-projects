package com.huang.elasticjob;

import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * Created by huang_jiangling on 2018/2/5.
 */
public class MySimpleJob implements SimpleJob {

    private static long lastTime = System.currentTimeMillis();

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("==================================");
        System.out.println(JSON.toJSONString(shardingContext, true));

        long nowTime = System.currentTimeMillis();
        long sec = (nowTime - lastTime) / 1000;
        lastTime = nowTime;
        System.out.println(Thread.currentThread().getName() + "-" + sec);

        System.out.println("==================================");
    }
}