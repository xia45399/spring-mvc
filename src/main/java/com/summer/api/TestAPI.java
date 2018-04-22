package com.summer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestAPI {
    @RequestMapping("test1")
    public Object test1() {
        return "test1";
    }
}
