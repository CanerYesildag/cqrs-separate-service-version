package com.example.couponcommandservice.application;

import com.example.couponcommandservice.domain.Coupon;
import com.example.couponcommandservice.infrastructure.KafkaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CouponEventHandler {

    private final KafkaClient kafkaClient;

    @EventListener
    public void handle(Coupon couponEvent) {
        log.info("[handle] Coupon domain event produce process started");
        kafkaClient.publish(couponEvent);
    }
}
