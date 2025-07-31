package com.fabric.traces.controller;

import com.fabric.common.core.domain.AjaxResult;
import com.fabric.traces.domain.TraceLngLat;
import com.fabric.traces.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 物流厂商管理服务接口
 */
@RestController
@RequestMapping("/traces/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    /**
     * 根据司机id查询该司机所参与的运输
     * @param driverId
     * @return
     */
    @GetMapping("/listTransport/{driverId}")
    public AjaxResult listTransport(@PathVariable("driverId") String driverId){
        return AjaxResult.success(driverService.listTransport(driverId));
    }

    /**
     *保存或修改
     * @param traceLngLat
     * @return
     */
    @PostMapping("/saveAndUpdateTransportInfoToDb")
    public AjaxResult saveAndUpdateTransportInfoToDb(@RequestBody TraceLngLat traceLngLat){
        System.out.println("lat   "+traceLngLat);
        return AjaxResult.success(driverService.saveAndUpdateTransportInfoToDb(traceLngLat));
    }

}
