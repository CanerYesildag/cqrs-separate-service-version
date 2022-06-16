package com.example.couponcommandservice.application.controller;

import com.example.couponcommandservice.application.CouponHandler;
import com.example.couponcommandservice.application.command.CreateCouponCommand;
import com.example.couponcommandservice.application.command.UpdateCouponCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("coupon/command")
public class CouponCommandController {

    private final CouponHandler<Object> couponHandler;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody CreateCouponCommand createCouponCommand) {
        couponHandler.sendCommand(createCouponCommand);
        return ResponseEntity.ok().build();
    }

    @PatchMapping
    public ResponseEntity<Object> update(@RequestBody UpdateCouponCommand updateCollectableCommand) {
        couponHandler.sendCommand(updateCollectableCommand);
        return ResponseEntity.ok().build();
    }
}
