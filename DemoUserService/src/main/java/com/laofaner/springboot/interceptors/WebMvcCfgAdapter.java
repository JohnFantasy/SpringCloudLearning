package com.laofaner.springboot.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lbc on 2017/11/28.
 * 拦截器适配器
 */
@Configuration
public class WebMvcCfgAdapter extends WebMvcConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(WebMvcCfgAdapter.class.getName());
    @Bean
    public TestInterceptor TestInterceptor(){

        return new TestInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("拦截器{}",registry.toString());
        //region 商城用户数据拦截器

        //支付
        registry.addInterceptor(TestInterceptor()).addPathPatterns("/demo1/test");

        super.addInterceptors(registry);

    }

}
