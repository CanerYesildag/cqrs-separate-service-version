package com.example.couponqueryservice.application;

public interface CouponHandler<I, T> {

    T sendQuery(I query);
}
