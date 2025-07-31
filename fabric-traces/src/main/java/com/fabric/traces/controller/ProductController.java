package com.fabric.traces.controller;

import com.fabric.common.core.domain.AjaxResult;
import com.fabric.traces.domain.TraceTask;
import com.fabric.traces.domain.TraceUserCrops;
import com.fabric.traces.domain.vo.CropsVo;
import com.fabric.traces.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.rmi.PortableRemoteObject;

@RestController
@RequestMapping("/traces/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/queryCropsList/{deptId}")
    public AjaxResult queryCropsList(@PathVariable Integer deptId){
        return AjaxResult.success(productService.queryCropsList(deptId));
    }

    @PostMapping("/addTask")
    public AjaxResult addTask(@RequestBody TraceTask traceTask){
        return AjaxResult.success(productService.addTask(traceTask));
    }

    @PostMapping("/updateMachingStatus")
    public AjaxResult updateMachingStatus(@RequestBody  CropsVo cropsVo){
        return AjaxResult.success(productService.updateMachingStatus(cropsVo));
    }

    @GetMapping("/queryTaskByCropsId/{cropsId}")
    public AjaxResult queryTaskByCropsId(@PathVariable("cropsId") String cropsId){
        return AjaxResult.success(productService.queryTaskByCropsId(cropsId));
    }

    @GetMapping("/updateProductWriteStatus/{cropsId}")
    public AjaxResult updateProductWriteStatus(@PathVariable("cropsId") String cropsId){
        return AjaxResult.success(productService.updateProductWriteStatus(cropsId));
    }

    @GetMapping("/queryTaskList")
    public AjaxResult queryTaskList(){
        return AjaxResult.success(productService.queryTaskList());
    }

    @GetMapping("/productOutFactory/{cropsId}")
    public AjaxResult productOutFactory(@PathVariable("cropsId") String cropsId){
        return AjaxResult.success(productService.productOutFactory(cropsId));
    }
}
