package com.example.couponcommandservice.infrastructure;

import com.example.couponcommandservice.domain.Coupon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaClient {

    public void publish(Coupon couponEvent) {
        log.info("[handle] Coupon domain couponEvent is produced successfully with couponId: {}, discount:{}, lowerLimit: {}",
                couponEvent.getId(), couponEvent.getDiscount(), couponEvent.getLowerLimit());
    }
}
