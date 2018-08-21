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

    /**
     * 1可插入 true
     * 2 接收参数 false
     * 3 返回值 false
     */
    @RequestMapping("/addBook")
    public BookBean addBook() {
        BookBean bookBean = new BookBean();
        bookBean.setName("测试");
        bookBean.setNumber(5);
        int id = bookService.insert(bookBean);
        System.out.println(bookBean);
        return bookBean;
    }

    @RequestMapping(value = "/list")
    public void main() {
        BookBean a = bookService.getById(1000L);
        System.out.println(a);
    }
}
