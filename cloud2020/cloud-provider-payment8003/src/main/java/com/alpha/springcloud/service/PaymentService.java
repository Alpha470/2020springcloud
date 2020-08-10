package com.alpha.springcloud.service;

import com.alpha.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */

@Service
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
