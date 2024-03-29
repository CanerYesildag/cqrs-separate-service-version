package com.example.couponqueryservice.application.controller;

import com.example.couponqueryservice.application.CouponHandler;
import com.example.couponqueryservice.application.query.GetCouponQuery;
import com.example.couponqueryservice.application.query.SearchCouponQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/collectable/query")
public class CouponQueryController {

    private final CouponHandler<Object, Object> couponHandler;

    @GetMapping("{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        GetCouponQuery getCouponQuery = new GetCouponQuery(id);
        var response = couponHandler.sendQuery(getCouponQuery);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/search")
    public ResponseEntity<Object> search(@RequestBody SearchCouponQuery searchCouponQuery) {
        var response = couponHandler.sendQuery(searchCouponQuery);
        return ResponseEntity.ok(response);
    }
}
