package com.example.couponqueryservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    private Long id;
    private BigDecimal discount;
    private BigDecimal lowerLimit;

}
