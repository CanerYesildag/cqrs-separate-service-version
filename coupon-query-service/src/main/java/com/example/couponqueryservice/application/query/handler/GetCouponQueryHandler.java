package com.example.couponqueryservice.application.query.handler;

import com.example.couponqueryservice.application.query.GetCouponQuery;
import com.example.couponqueryservice.domain.Coupon;
import com.example.couponqueryservice.infrastructure.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetCouponQueryHandler implements CouponQueryHandler<GetCouponQuery, Coupon> {

    private final CouponRepository couponRepository;

    @Override
    public Coupon execute(GetCouponQuery query) {
        return couponRepository.getById(query.id());
    }

    @Override
    public boolean isMatched(String className) {
        return className.equals(GetCouponQuery.class.getSimpleName());
    }
}
