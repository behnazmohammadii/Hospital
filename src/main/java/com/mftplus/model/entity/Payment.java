package com.mftplus.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString
public class Payment {
    private int id;
    private int paymentId;
    private double amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    private Visit visit;


}
