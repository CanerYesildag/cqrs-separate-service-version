package com.example.couponcommandservice.application.command;

import com.example.couponcommandservice.application.command.handler.CouponCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CouponCommandHandlerFactory {

    private final List<CouponCommandHandler> commandHandlers;

    public <T> CouponCommandHandler<Object> getHandler(Class<T> classType) {
        return commandHandlers.stream()
                .filter(commandHandler -> commandHandler.isMatched(classType.getSimpleName()))
                .findFirst()
                .orElseThrow();
    }
}
