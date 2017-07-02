package com.huang.activit.model.activiti;


import java.util.Map;

/**
 * Created by huang on 17/3/21.
 */
public class TaskParam {

    /**
     * 流程图名称;
     */
    private String workFlowPicName;

    /**
     * 单号;
     */
    private String applyCode;

    /**
     * 流程图中的task节点;
     */
    private String node;

    /**
     * 工作流 节点 和 连线中的变量值;
     */
    private Map<String, String> variables;

    /**
     * 监听事件名称;
     */
    private String eventName;

    @Override
    public String toString() {
        return "TaskParam{" +
                "workFlowPicName='" + workFlowPicName + '\'' +
                ", applyCode='" + applyCode + '\'' +
                ", node='" + node + '\'' +
                ", variables=" + variables +
                ", eventName='" + eventName + '\'' +
                '}';
    }

    public String getWorkFlowPicName() {
        return workFlowPicName;
    }

    public void setWorkFlowPicName(String workFlowPicName) {
        this.workFlowPicName = workFlowPicName;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
