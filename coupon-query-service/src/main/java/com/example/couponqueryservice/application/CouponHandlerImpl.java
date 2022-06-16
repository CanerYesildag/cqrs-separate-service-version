package com.example.couponqueryservice.application;

import com.example.couponqueryservice.application.query.CouponQueryHandlerFactory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouponHandlerImpl implements CouponHandler<Object, Object> {

    private final CouponQueryHandlerFactory queryHandlerFactory;

    @Override
    public Object sendQuery(Object query) {
        return queryHandlerFactory.getHandler(query.getClass()).execute(query);
    }
}
