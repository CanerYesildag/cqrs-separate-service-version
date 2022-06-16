package com.example.couponcommandservice.application;

import com.example.couponcommandservice.application.command.CouponCommandHandlerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouponHandlerImpl implements CouponHandler<Object> {

    private final CouponCommandHandlerFactory commandHandlerFactory;

    @Override
    public void sendCommand(Object command) {
        commandHandlerFactory.getHandler(command.getClass()).execute(command);
    }
}
