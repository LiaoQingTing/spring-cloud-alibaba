package com.liaoqingting.springboot.controller;

import com.liaoqingting.springboot.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiaoQingTing
 * @version 1.0
 * @date 2020/10/27 下午1:49
 */

@Slf4j
@RestController
public class OrderController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")int id){
        return paymentFeignService.getPayment(id);
    }
}
