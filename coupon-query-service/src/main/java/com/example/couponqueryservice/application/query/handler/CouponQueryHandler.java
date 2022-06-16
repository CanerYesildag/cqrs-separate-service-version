package com.example.couponqueryservice.application.query.handler;

public interface CouponQueryHandler<I, T> {

    T execute(I query);

    boolean isMatched(String className);
}
