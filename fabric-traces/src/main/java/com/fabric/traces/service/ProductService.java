package com.fabric.traces.service;

import com.fabric.traces.domain.TraceTask;
import com.fabric.traces.domain.vo.CropsVo;

import java.util.List;

public interface ProductService {
    List<CropsVo> queryCropsList(Integer deptId);

    int addTask(TraceTask traceTask);

    int updateMachingStatus(CropsVo cropsVo);

    TraceTask queryTaskByCropsId(String cropsId);

    int updateProductWriteStatus(String cropsId);

    List<TraceTask> queryTaskList();

    int productOutFactory(String cropsId);
}
