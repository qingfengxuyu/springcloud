package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Summer
 * @Date:2020/9/30 15:09
 * @Description:
 */
    @RestController
    public class PaymentController
    {
        @Value("${server.port}")
        private String serverPort;

        @GetMapping(value = "/payment/nacos/{id}")
        public String getPayment(@PathVariable("id") Integer id)
        {
            return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
        }
    }

