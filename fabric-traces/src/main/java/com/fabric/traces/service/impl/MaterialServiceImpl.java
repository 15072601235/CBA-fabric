package com.fabric.traces.service.impl;

import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.mapper.TraceTransportMapper;
import com.fabric.traces.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Override
    public List<TraceTransport> listCrops(String deptId) {
        return traceTransportMapper.listCrops(deptId);
    }

    @Override
    public int changeInToOut(String cropsId) {
        return traceTransportMapper.changeInToOut(cropsId);
    }

    @Override
    public int addTransport(TraceTransport traceTransport) {
        return traceTransportMapper.insertSelective(traceTransport);
    }
}
