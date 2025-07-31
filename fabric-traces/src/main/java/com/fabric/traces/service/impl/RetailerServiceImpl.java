package com.fabric.traces.service.impl;

import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.mapper.TraceTransportMapper;
import com.fabric.traces.service.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerServiceImpl implements RetailerService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;

    @Override
    public int updateReceiveStatus(TraceTransport traceTransport) {
        return traceTransportMapper.updateReceiveStatus(traceTransport);
    }
}
