package com.fabric.traces.service;

import com.fabric.common.core.domain.AjaxResult;
import com.fabric.traces.domain.TraceTransport;

import java.util.List;

public interface MaterialService {
    List<TraceTransport> listCrops(String deptId);

    int changeInToOut(String cropsId);

    int addTransport(TraceTransport traceTransport);
}
