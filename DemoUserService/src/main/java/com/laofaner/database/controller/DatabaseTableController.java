package com.laofaner.database.controller;

import java.util.List;

import com.laofaner.springboot.test.obj.Result;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import com.laofaner.database.service.IDatabaseTableService;
import com.laofaner.database.entity.DatabaseTable;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 数据库表接入记录表 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-07
 */
@RestController
@RequestMapping("/databaseTable")
public class DatabaseTableController {

    @Autowired
    private IDatabaseTableService cspMonitorDatabaseTableService;


    @GetMapping(value = "/page")
    public Result<IPage> getDatabaseTablePage(Page<DatabaseTable> page, DatabaseTable cspMonitorDatabaseTable){
        return new Result<>(cspMonitorDatabaseTableService.page(page,Wrappers.query(cspMonitorDatabaseTable)) );
    }


    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody DatabaseTable cspMonitorDatabaseTable, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorDatabaseTableService.save(cspMonitorDatabaseTable));
    }


    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody DatabaseTable cspMonitorDatabaseTable, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
         }
        return new Result<>(cspMonitorDatabaseTableService.updateById(cspMonitorDatabaseTable));
    }

    
    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id){
        return new Result<>(cspMonitorDatabaseTableService.removeById(id));
    }
}
