package com.example.couponcommandservice.application.command;

import java.math.BigDecimal;

public record CreateCouponCommand(
        BigDecimal discount,
        BigDecimal lowerLimit
) {
}
