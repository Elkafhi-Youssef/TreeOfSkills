package com.skills.treeofskills.service;

import com.skills.treeofskills.model.Book;

import java.util.List;

public interface BookService {
    long save(Book book);
    Book get(long id);
    List<Book> list();
    void update(long id, Book book);
    void delete(long id);
}
