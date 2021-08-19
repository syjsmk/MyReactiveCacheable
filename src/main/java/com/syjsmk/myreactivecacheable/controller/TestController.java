package com.syjsmk.myreactivecacheable.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @Cacheable(value = "reactive", cacheManager = "cacheManager")
    @PostMapping("/reactive")
    public Mono<Integer> reactiveEndpoint(@RequestBody Mono<Integer> body) {
        body.subscribe(v -> System.out.println("v = " + v));

        return Mono.just(1);
    }

    @Cacheable(value = "non", cacheManager = "cacheManager")
    @PostMapping("/non")
    public Integer nonReactiveEndpoint(@RequestBody Integer body) {

        System.out.println(body);

        return 1;
    }

}
