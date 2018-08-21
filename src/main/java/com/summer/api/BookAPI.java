package com.summer.api;

import com.summer.bean.BookBean;
import com.summer.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/book")
public class BookAPI {

    @Resource
    private BookService bookService;

    @RequestMapping(value = "/list")
    public void main() {
        BookBean a = bookService.getById(1000L);
        System.out.println(a);
    }
}
