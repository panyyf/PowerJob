package com.github.kfcfans.oms.server.persistence.repository;

import com.github.kfcfans.oms.server.persistence.model.JobInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JobInfo 数据访问层
 *
 * @author tjq
 * @since 2020/4/1
 */
public interface JobInfoRepository extends JpaRepository<JobInfoDO, Long> {


    List<JobInfoDO> findByAppIdInAndNextTriggerTimeLessThanEqual(List<Long> appIds, Long time);

    List<JobInfoDO> findByAppIdAndNextTriggerTimeLessThanEqual(Long appId, Long time);
}