package com.summer.dao;

import com.summer.bean.BookBean;

public interface BookDao {
    BookBean queryById(long id);

    int insertBook(BookBean bookBean);
}
