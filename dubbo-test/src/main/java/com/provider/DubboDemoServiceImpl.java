package com.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DubboDemoServiceImpl implements IDubboDemoService {

    @Override
    public String helloDubbo() {
        return "hello dubbo, I'm server!";
    }
}