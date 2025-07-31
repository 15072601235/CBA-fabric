package com.fabric.traces.service;

import com.fabric.traces.domain.TraceTransport;

public interface RetailerService {
    int updateReceiveStatus(TraceTransport traceTransport);
}
