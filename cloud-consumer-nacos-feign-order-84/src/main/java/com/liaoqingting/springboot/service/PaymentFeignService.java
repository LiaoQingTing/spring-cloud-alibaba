package com.liaoqingting.springboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiaoQingTing
 * @version 1.0
 * @date 2020/10/27 下午1:46
 */

@Component
@FeignClient("nacos-payment-provider")
public interface PaymentFeignService {

    @GetMapping("/payment/nacos/{id}")
    String getPayment(@PathVariable("id")int id);
}
