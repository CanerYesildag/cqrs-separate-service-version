package com.example.couponqueryservice.application.query;

import java.math.BigDecimal;

public record SearchCouponQuery(
        BigDecimal price
) {
}
