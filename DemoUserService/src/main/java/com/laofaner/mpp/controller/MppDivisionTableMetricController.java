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
import com.laofaner.mpp.service.IMppDivisionTableMetricService;
import com.laofaner.mpp.entity.MppDivisionTableMetric;
import com.laofaner.mpp.obj.Result;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分表指标记录表 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-11-07
 */
@RestController
@RequestMapping("/mppDivisionTableMetric")
public class MppDivisionTableMetricController {

    @Autowired
    private IMppDivisionTableMetricService cspMonitorMppDivisionTableMetricService;


    @GetMapping(value = "/page")
    public Result<IPage> getMppDivisionTableMetricPage(Page<MppDivisionTableMetric> page, MppDivisionTableMetric cspMonitorMppDivisionTableMetric){
        return new Result<>(cspMonitorMppDivisionTableMetricService.page(page,Wrappers.query(cspMonitorMppDivisionTableMetric)) );
    }


    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody MppDivisionTableMetric cspMonitorMppDivisionTableMetric, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorMppDivisionTableMetricService.save(cspMonitorMppDivisionTableMetric));
    }


    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody MppDivisionTableMetric cspMonitorMppDivisionTableMetric, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
         }
        return new Result<>(cspMonitorMppDivisionTableMetricService.updateById(cspMonitorMppDivisionTableMetric));
    }

    
    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id){
        return new Result<>(cspMonitorMppDivisionTableMetricService.removeById(id));
    }
}
