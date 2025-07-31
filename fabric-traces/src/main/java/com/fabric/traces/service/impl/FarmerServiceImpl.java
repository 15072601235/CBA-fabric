package com.fabric.traces.service.impl;

import com.fabric.common.core.domain.entity.SysDept;
import com.fabric.common.core.domain.entity.SysUser;
import com.fabric.system.mapper.SysDeptMapper;
import com.fabric.system.mapper.SysUserMapper;
import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.domain.TraceUserCrops;
import com.fabric.traces.mapper.TraceTransportMapper;
import com.fabric.traces.mapper.TraceUserCropsMapper;
import com.fabric.traces.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerServiceImpl implements FarmerService {
    @Autowired
    private TraceUserCropsMapper traceCropsMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public int saveCrops(TraceUserCrops traceCrops) {
        return traceCropsMapper.insert(traceCrops);
    }

    @Override
    public List<TraceUserCrops> getCropsByUsername(String username) {
        return traceCropsMapper.getCropsByUsername(username);
    }

    @Override
    public List<SysUser> getAllDriverByDeptId(String deptId) {
        return sysUserMapper.selectUserByDeptId(deptId);
    }

    @Override
    public int addTransport(TraceTransport traceTransport) {
        int i = traceCropsMapper.updateByCropsId(traceTransport.getCropsId());
        return traceTransportMapper.insertSelective(traceTransport);
    }

    @Override
    public List<SysDept> getFactoryByDeptId(Integer deptId) {
        return sysDeptMapper.getFactoryByDeptId(deptId);
    }


}
