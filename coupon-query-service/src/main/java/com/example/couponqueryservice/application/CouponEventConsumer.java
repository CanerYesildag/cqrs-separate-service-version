package com.example.couponqueryservice.application;

import com.example.couponqueryservice.domain.Coupon;
import com.example.couponqueryservice.infrastructure.CouponRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CouponEventConsumer {

    private final CouponRepository couponRepository;

    @EventListener
    public void consume(Coupon couponEvent) {
        log.info("[handle] Coupon domain event consumed");
        couponRepository.saveOnReadDB(couponEvent);
        log.info("[handle] Coupon domain couponEvent is saved successfully with couponId: {}, discount:{}, lowerLimit: {}",
                couponEvent.getId(), couponEvent.getDiscount(), couponEvent.getLowerLimit());
    }
}
