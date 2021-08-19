package com.syjsmk.myreactivecacheable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MyReactiveCacheableApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyReactiveCacheableApplication.class, args);
    }

}
