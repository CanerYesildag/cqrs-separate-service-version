package com.example.couponcommandservice.application;

public interface CouponHandler<I> {

    void sendCommand(I command);
}
