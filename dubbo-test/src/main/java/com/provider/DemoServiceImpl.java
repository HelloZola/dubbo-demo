package com.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements IDemoService {

    @Reference
    public IDubboDemoService dubboDemoService;

    @Override
    public String test() {
        return dubboDemoService.helloDubbo();
    }
}