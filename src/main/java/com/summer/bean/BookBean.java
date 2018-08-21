package com.summer.bean;

/**
 * 图书实体
 */
public class BookBean {
    // 图书ID
    private long id;
    // 图书名称
    private String name;
    // 馆藏数量
    private int number;


    public BookBean(long id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public BookBean() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
