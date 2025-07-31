package com.fabric.traces.service.impl;

import com.fabric.system.mapper.SysUserMapper;
import com.fabric.traces.domain.TraceLngLat;
import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.domain.vo.LngLatVo;
import com.fabric.traces.mapper.TraceLngLatMapper;
import com.fabric.traces.mapper.TraceTransportMapper;
import com.fabric.traces.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private TraceLngLatMapper traceLngLatMapper;
    @Override
    public List<TraceTransport> listTransport(String driverId) {
        return traceTransportMapper.listTransport(driverId);
    }

    @Override
    public int saveAndUpdateTransportInfoToDb(TraceLngLat traceLngLat) {
        TraceTransport traceTransport = new TraceTransport();
        traceTransport.setOutFactoryStatus(traceLngLat.getOutFactoryStatus());
        traceTransport.setId(traceLngLat.getId());
        traceTransport.setCropsId(traceLngLat.getCropsId());
        traceTransport.setStatus(traceLngLat.getStatus());

        traceLngLatMapper.insertSelective(traceLngLat);
        return traceTransportMapper.updateByCropsId(traceTransport);
    }

}
