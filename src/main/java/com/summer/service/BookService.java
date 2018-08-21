package com.summer.service;

import com.summer.bean.BookBean;
import com.summer.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    private BookDao bookDao;

    public BookBean getById(long id) {
        return bookDao.queryById(id);
    }
}
