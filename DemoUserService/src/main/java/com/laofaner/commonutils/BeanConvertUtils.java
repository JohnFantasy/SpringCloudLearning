package com.laofaner.commonutils;

import com.laofaner.springboot.domain.dto.TestDTO;
import com.laofaner.springboot.domain.entity.TestEntity;
import org.springframework.beans.BeanUtils;

/**
 * @program: SpringBoot&SpringCloud
 * @description: java bean转换工具类，提供Entity和DTO等其他bean之间的互相转换功能
 * @author: fyz
 * @create: 2019-10-18 09:51
 **/
public class BeanConvertUtils {

    public static TestDTO convertUserEntityToDTO(TestEntity userEntity) {

        TestDTO testDTO = new TestDTO();
        BeanUtils.copyProperties(userEntity, testDTO);
        System.out.println(testDTO);
        return testDTO;
    }
}
