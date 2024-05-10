package com.example.payment.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaymentEntity {

    @Id
    @Column (name = "ID")
    private Long id;
    @Column (name = "RESERVATIONID")
    private Long reservationId;
    @Column (name = "CUSTOMERID")
    private Long customerId;
    @Column (name = "ROOMID")
    private Long roomId;
    @Column (name = "PAYMENTSTATUS")
    private String paymentStatus;
    @Column (name = "EMAIL")
    private String email;
}
