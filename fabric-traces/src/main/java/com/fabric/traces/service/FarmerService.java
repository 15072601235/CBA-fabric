package com.fabric.traces.service;

import com.fabric.common.core.domain.entity.SysDept;
import com.fabric.common.core.domain.entity.SysUser;
import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.domain.TraceUserCrops;

import java.util.List;

public interface FarmerService {
    int saveCrops(TraceUserCrops traceCrops);

    List<TraceUserCrops> getCropsByUsername(String username);

    List<SysUser> getAllDriverByDeptId(String deptId);

    int addTransport(TraceTransport traceTransport);

    List<SysDept> getFactoryByDeptId(Integer deptId);
}
