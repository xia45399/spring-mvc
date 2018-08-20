package com.summer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestAPI {
    @RequestMapping("test1")
    public Object test1(Long a) {
        return a;
    }

    @RequestMapping("test2")
    public Object test2(String a) {
        return "String类型=" + a;
    }

    @RequestMapping("test3")
    public Object test3() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "类型");
        return map;
    }
}
