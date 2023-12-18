//package com.laofaner.zk.controller;
//
//import java.util.List;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import javax.validation.Valid;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.laofaner.zk.service.IZkConfigService;
//import com.laofaner.zk.entity.ZkConfig;
//import com.laofaner.zk.obj.Result;
//
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * <p>
// * 配置管理表 控制器
// * </p>
// *
// * @author fanyuzhuo
// * @since 2023-08-31
// */
//@RestController
//@RequestMapping("/zkConfig")
//public class ZkConfigController {
//
//    @Autowired
//    private IZkConfigService cspMonitorZkConfigService;
//
//
//    @GetMapping(value = "/page")
//    public Result<IPage> getZkConfigPage(Page<ZkConfig> page, ZkConfig cspMonitorZkConfig){
//        return new Result<>(cspMonitorZkConfigService.page(page,Wrappers.query(cspMonitorZkConfig)) );
//    }
//
//
//    @PostMapping(value = "/add")
//    public Result create(@Valid @RequestBody ZkConfig cspMonitorZkConfig, BindingResult bindingResult){
//        if (bindingResult.hasErrors()) {
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            return new Result<>(fieldErrors);
//        }
//        return new Result<>(cspMonitorZkConfigService.save(cspMonitorZkConfig));
//    }
//
//
//    @PutMapping(value = "/update")
//    public Result update(@Valid @RequestBody ZkConfig cspMonitorZkConfig, BindingResult bindingResult){
//        if (bindingResult.hasErrors()) {
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            return new Result<>(fieldErrors);
//         }
//        return new Result<>(cspMonitorZkConfigService.updateById(cspMonitorZkConfig));
//    }
//
//
//    @DeleteMapping(value = "/delete/{id}")
//    public Result delete(@PathVariable Integer id){
//        return new Result<>(cspMonitorZkConfigService.removeById(id));
//    }
//}
