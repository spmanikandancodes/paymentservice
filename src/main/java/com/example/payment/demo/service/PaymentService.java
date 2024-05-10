package com.example.payment.demo.service;

import com.example.payment.demo.entity.PaymentEntity;
import com.example.payment.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

   public PaymentEntity processPay(PaymentEntity paymentEntity) {

       try {
           return paymentRepository.saveAndFlush(paymentEntity);
       } catch (Exception e) {

           throw e;
       }

   }


}
