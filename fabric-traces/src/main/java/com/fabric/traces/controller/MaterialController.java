package com.fabric.traces.controller;

import com.fabric.common.core.domain.AjaxResult;
import com.fabric.traces.domain.TraceTransport;
import com.fabric.traces.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 原料厂商服务管理接口
 */
@RestController
@RequestMapping("/traces/material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @GetMapping("/listCrops/{deptId}")
    public AjaxResult listCrops(@PathVariable("deptId") String deptId){
        return AjaxResult.success(materialService.listCrops(deptId));
    }

    /**
     * @author wx
     * @Date 23:47 2020/11/7 0007
     * @Param [cropsId] 根据农产品id查询原料出库情况
     * @return com.fabric.common.core.domain.AjaxResult
     **/
    @GetMapping("/changeInToOut/{cropsId}")
    public AjaxResult changeInToOut(@PathVariable("cropsId") String cropsId){
        return AjaxResult.success(materialService.changeInToOut(cropsId));
    }

    /**
     * 添加物流运输
     * @param traceTransport
     * @return
     */
    @PostMapping("/addTransport")
    public AjaxResult addTransport(@RequestBody TraceTransport traceTransport){
        return AjaxResult.success(materialService.addTransport(traceTransport));
    }
}
