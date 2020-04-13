package com.github.kfcfans.oms.server.web.response;

import lombok.Data;

import java.util.Date;

/**
 * ExecuteLog 对外展示对象
 *
 * @author tjq
 * @since 2020/4/12
 */
@Data
public class InstanceLogVO {

    // 任务ID
    private Long jobId;
    // 任务所属应用的ID，冗余提高查询效率
    private Long appId;
    // 任务实例ID
    private Long instanceId;

    // 执行结果
    private String result;
    // 预计触发时间
    private Long expectedTriggerTime;
    // 实际触发时间
    private Long actualTriggerTime;
    // 结束时间
    private Long finishedTime;
    // TaskTracker地址
    private String taskTrackerAddress;

    // 总共执行的次数（用于重试判断）
    private Long runningTimes;

    private Date gmtCreate;
    private Date gmtModified;

    /* ********** 不一致区域 ********** */
    private String status;
}