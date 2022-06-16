package com.example.couponcommandservice.infrastructure;

import com.example.couponcommandservice.domain.Coupon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Slf4j
@Repository
public class CouponRepository {

    public Coupon getById(Long id) {
        Coupon coupon = new Coupon(id, BigDecimal.ONE, BigDecimal.TEN);
        log.info("[getById] Coupon is got successfully with couponId: {}", coupon.getId());
        return coupon;
    }

    public void saveOnWriteDB(Coupon coupon) {
        log.info("[saveOnWriteDB] Coupon is saved successfully with couponId: {}, discount:{}, lowerLimit: {}",
                coupon.getId(), coupon.getDiscount(), coupon.getLowerLimit());
    }
}
