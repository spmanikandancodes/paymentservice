package com.example.payment.demo.controller;


import com.example.payment.demo.entity.PaymentEntity;
import com.example.payment.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/payments")
public class PaymentController {


    @Autowired
    PaymentService paymentService;


    @PostMapping("/pay")
    public ResponseEntity<PaymentEntity> makePayment(@RequestBody PaymentEntity paymentEntity) {

        try {
            PaymentEntity paid = paymentService.processPay(paymentEntity);
            return ResponseEntity.ok(paid);
        } catch (Exception e) {
            throw e;

        }
    }
}







