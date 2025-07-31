package com.fabric.traces.service;

import com.fabric.traces.domain.TraceLngLat;
import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.domain.vo.LngLatVo;

import java.util.List;

public interface DriverService {
    List<TraceTransport> listTransport(String driverId);

    int saveAndUpdateTransportInfoToDb(TraceLngLat traceLngLat);
}
