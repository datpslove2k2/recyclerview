package com.example.recyclerview_cardview;

import java.util.List;


public class Category2 {
    private String nameCategory;
    private List<Book2> books;
    public Category2 (String nameCategory, List<Book2> books) {
        this.nameCategory = nameCategory;
        this.books = books;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Book2> getBooks() {
        return books;
    }

    public void setBooks(List<Book2> books) {
        this.books = books;
    }
}
