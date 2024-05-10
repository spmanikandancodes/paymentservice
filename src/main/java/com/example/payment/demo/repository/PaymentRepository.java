package com.example.payment.demo.repository;

import com.example.payment.demo.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository <PaymentEntity , Long> {
}


