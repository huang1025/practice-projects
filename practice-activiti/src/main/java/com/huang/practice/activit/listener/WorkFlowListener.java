package com.huang.practice.activit.listener;

import com.alibaba.fastjson.JSON;
import com.huang.practice.activit.model.activiti.TaskParam;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by huang on 2017/7/1.
 */
@Component
public class WorkFlowListener implements ExecutionListener, TaskListener {

    @Autowired
    private RepositoryService repositoryService;

    @Override
    public void notify(DelegateTask delegateTask) {
        String eventName = delegateTask.getEventName();
        DelegateExecution execution = delegateTask.getExecution();
        TaskParam taskParam = parseExecution(execution);
        taskParam.setEventName(eventName);
        System.out.println(JSON.toJSONString(taskParam, true));
    }

    @Override
    @Transactional
    public void notify(DelegateExecution execution) throws Exception {
        try {
            TaskParam taskParam = parseExecution(execution);
            System.out.println(JSON.toJSONString(taskParam, true));
        } catch (Exception e) {
            System.out.println("非常严重的错误:工作流通知报错");

        }
    }

    /**
     * 解析参数成TaskParam;
     */
    public TaskParam parseExecution(DelegateExecution delegateExecution) {

        TaskParam taskParam = new TaskParam();

        taskParam.setWorkFlowPicName(getProcessDefinitionName(delegateExecution.getProcessDefinitionId()));
        taskParam.setApplyCode(getBusinessKey(delegateExecution));
        taskParam.setNode(delegateExecution.getCurrentActivityId());
        taskParam.setVariables(getAllVariables(delegateExecution));
        taskParam.setEventName(delegateExecution.getEventName());

        return taskParam;
    }

    public String getProcessDefinitionName(String processDefinitionId) {
        return repositoryService.createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult().getName();
    }

    public String getBusinessKey(DelegateExecution delegateExecution) {
        return delegateExecution.getProcessBusinessKey();
    }

    private Map<String, String> getAllVariables(DelegateExecution delegateExecution) {

        Map<String, String> returnMap = new HashMap<>();

        Set<String> variableNames = delegateExecution.getVariableNames();
        if (variableNames != null) {
            for (String each : variableNames) {
                returnMap.put(each, JSON.toJSONString(delegateExecution.getVariable(each)));
            }
        }

        Map<String, Object> variablesLocal = delegateExecution.getVariablesLocal();
        if (variablesLocal != null) {
            for (String each : variablesLocal.keySet()) {
                returnMap.put(each, JSON.toJSONString(delegateExecution.getVariableLocal(each)));
            }
        }

        return returnMap;
    }
}
