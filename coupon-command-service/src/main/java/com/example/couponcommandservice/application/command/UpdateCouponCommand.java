package com.example.couponcommandservice.application.command;

import java.math.BigDecimal;

public record UpdateCouponCommand(
        Long id,
        BigDecimal discount,
        BigDecimal lowerLimit
) {
}
