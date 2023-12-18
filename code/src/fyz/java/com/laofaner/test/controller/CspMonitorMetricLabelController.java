package com.laofaner.test.controller;

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
import com.laofaner.test.service.ICspMonitorMetricLabelService;
import com.laofaner.test.entity.CspMonitorMetricLabel;
import com.laofaner.test.obj.Result;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 指标标签表 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-05-05
 */
@Api(tags = "CspMonitorMetricLabel管理")
@RestController
@RequestMapping("/cspMonitorMetricLabel")
public class CspMonitorMetricLabelController {

    @Autowired
    private ICspMonitorMetricLabelService cspMonitorMetricLabelService;

    @ApiOperation(value = "查询CspMonitorMetricLabel")
    @GetMapping(value = "/page")
    public Result<IPage> getCspMonitorMetricLabelPage(Page<CspMonitorMetricLabel> page, CspMonitorMetricLabel cspMonitorMetricLabel){
        return new Result<>(cspMonitorMetricLabelService.page(page,Wrappers.query(cspMonitorMetricLabel)) );
    }

    @ApiOperation(value = "新增CspMonitorMetricLabel")
    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody CspMonitorMetricLabel cspMonitorMetricLabel, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorMetricLabelService.save(cspMonitorMetricLabel));
    }

    @ApiOperation(value = "修改CspMonitorMetricLabel")
    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody CspMonitorMetricLabel cspMonitorMetricLabel, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
         }
        return new Result<>(cspMonitorMetricLabelService.updateById(cspMonitorMetricLabel));
    }

    @ApiOperation(value = "删除CspMonitorMetricLabel")
    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id){
        for(int i = 0;i <xxx.length;i++){
            System.out.println();
        }
        return new Result<>(cspMonitorMetricLabelService.removeById(id));
    }
}
