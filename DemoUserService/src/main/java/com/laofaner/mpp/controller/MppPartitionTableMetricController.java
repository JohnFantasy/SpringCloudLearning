package com.laofaner.mpp.controller;

import java.util.List;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import com.laofaner.mpp.service.IMppPartitionTableMetricService;
import com.laofaner.mpp.entity.MppPartitionTableMetric;
import com.laofaner.mpp.obj.Result;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * MPP分区表指标记录表 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-11-07
 */
@RestController
@RequestMapping("/mppPartitionTableMetric")
public class MppPartitionTableMetricController {

    @Autowired
    private IMppPartitionTableMetricService cspMonitorMppPartitionTableMetricService;


    @GetMapping(value = "/page")
    public Result<IPage> getMppPartitionTableMetricPage(Page<MppPartitionTableMetric> page, MppPartitionTableMetric cspMonitorMppPartitionTableMetric){
        return new Result<>(cspMonitorMppPartitionTableMetricService.page(page,Wrappers.query(cspMonitorMppPartitionTableMetric)) );
    }


    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody MppPartitionTableMetric cspMonitorMppPartitionTableMetric, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorMppPartitionTableMetricService.save(cspMonitorMppPartitionTableMetric));
    }


    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody MppPartitionTableMetric cspMonitorMppPartitionTableMetric, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
         }
        return new Result<>(cspMonitorMppPartitionTableMetricService.updateById(cspMonitorMppPartitionTableMetric));
    }

    
    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id){
        return new Result<>(cspMonitorMppPartitionTableMetricService.removeById(id));
    }
}
