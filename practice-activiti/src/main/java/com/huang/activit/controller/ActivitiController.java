package com.huang.activit.controller;

import com.huang.activit.model.BaseParam;
import com.huang.activit.model.activiti.PushParam;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2017/7/1.
 */
@RestController
@RequestMapping("/activiti")
public class ActivitiController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/create")
    public String create(@RequestBody BaseParam baseParam) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess", baseParam.getId());
        return processInstance.toString();
    }

    @RequestMapping("push")
    public String push(@RequestBody PushParam pushParam) {

        Map<String, Object> map = new HashMap<>();
        String direction = pushParam.getDirection();
        if (StringUtils.isNotBlank(direction)) {
            map.put("ren_shi_shen_pi", direction);
            map.put("bu_men_shen_pi", direction);
        }

        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery()
                .processInstanceBusinessKey(pushParam.getId())
                .singleResult();
        Task task = taskService.createTaskQuery().processInstanceBusinessKey(pushParam.getId()).singleResult();
        taskService.complete(task.getId(), map);
        return processInstance.toString();
    }
}
