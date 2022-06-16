package com.example.couponcommandservice.application.command.handler;

public interface CouponCommandHandler<R> {

     void execute(R command);

     boolean isMatched(String className);
}
