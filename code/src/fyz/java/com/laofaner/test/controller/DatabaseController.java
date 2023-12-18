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
import com.laofaner.test.service.IDatabaseService;
import com.laofaner.test.entity.Database;
import com.laofaner.test.obj.Result;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 数据库管理表 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-07-31
 */
@Api(tags = "Database管理")
@RestController
@RequestMapping("/database")
public class DatabaseController {

    @Autowired
    private IDatabaseService cspMonitorDatabaseService;

    @ApiOperation(value = "查询Database")
    @GetMapping(value = "/page")
    public Result<IPage> getDatabasePage(Page<Database> page, Database cspMonitorDatabase){
        return new Result<>(cspMonitorDatabaseService.page(page,Wrappers.query(cspMonitorDatabase)) );
    }

    @ApiOperation(value = "新增Database")
    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody Database cspMonitorDatabase, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorDatabaseService.save(cspMonitorDatabase));
    }

    @ApiOperation(value = "修改Database")
    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody Database cspMonitorDatabase, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
         }
        return new Result<>(cspMonitorDatabaseService.updateById(cspMonitorDatabase));
    }

    @ApiOperation(value = "删除Database")
    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id){
        return new Result<>(cspMonitorDatabaseService.removeById(id));
    }
}
