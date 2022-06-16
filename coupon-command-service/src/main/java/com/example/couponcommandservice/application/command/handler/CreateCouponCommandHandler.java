package com.example.couponcommandservice.application.command.handler;

import com.example.couponcommandservice.application.command.CreateCouponCommand;
import com.example.couponcommandservice.domain.Coupon;
import com.example.couponcommandservice.infrastructure.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class CreateCouponCommandHandler implements CouponCommandHandler<CreateCouponCommand> {

    private final CouponRepository couponRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void execute(CreateCouponCommand command) {
        Coupon createdCoupon = new Coupon(new Random().nextLong(0, 99999), command.discount(), command.lowerLimit());
        couponRepository.saveOnWriteDB(createdCoupon);
        eventPublisher.publishEvent(createdCoupon);
    }

    @Override
    public boolean isMatched(String className) {
        return className.equals(CreateCouponCommand.class.getSimpleName());
    }
}
