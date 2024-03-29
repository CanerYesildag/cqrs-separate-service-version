package com.example.couponqueryservice.application.query;

import com.example.couponqueryservice.application.query.handler.CouponQueryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CouponQueryHandlerFactory {

    private final List<CouponQueryHandler> queryHandlers;

    public <T> CouponQueryHandler<Object, Object> getHandler(Class<T> classType) {
        return queryHandlers.stream()
                .filter(commandHandler -> commandHandler.isMatched(classType.getSimpleName()))
                .findFirst()
                .orElseThrow();
    }
}
