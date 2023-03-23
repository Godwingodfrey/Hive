package com.example.hive.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentResponse {
    private String message;
    private BigDecimal currentBalance;
}