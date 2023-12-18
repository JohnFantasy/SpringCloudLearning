package com.laofaner.zk.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.laofaner.springboot.test.obj.Result;
import com.laofaner.zk.entity.ZkDevice;
import com.laofaner.zk.service.IZkDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 控制器
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-26
 */
@RestController
@RequestMapping("/zkDevice")
public class ZkDeviceController {

    @Autowired
    private IZkDeviceService cspMonitorZkDeviceService;


    @GetMapping(value = "/page")
    public Result<IPage> getZkDevicePage(Page<ZkDevice> page, ZkDevice cspMonitorZkDevice) {
        return new Result<>(cspMonitorZkDeviceService.page(page, Wrappers.query(cspMonitorZkDevice)));
    }


    @PostMapping(value = "/add")
    public Result create(@Valid @RequestBody ZkDevice cspMonitorZkDevice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorZkDeviceService.save(cspMonitorZkDevice));
    }


    @PutMapping(value = "/update")
    public Result update(@Valid @RequestBody ZkDevice cspMonitorZkDevice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            return new Result<>(fieldErrors);
        }
        return new Result<>(cspMonitorZkDeviceService.updateById(cspMonitorZkDevice));
    }


    @DeleteMapping(value = "/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        return new Result<>(cspMonitorZkDeviceService.removeById(id));
    }
}
