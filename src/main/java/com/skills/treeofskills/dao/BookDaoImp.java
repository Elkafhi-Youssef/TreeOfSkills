package com.skills.treeofskills.dao;

import com.skills.treeofskills.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImp implements BookDao{


    private SessionFactory sessionFactory;
    @Autowired
    public BookDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public long save(Book book) {
        sessionFactory.getCurrentSession().persist(book);
        return book.getId();
    }

    @Override
    public Book get(long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> list() {
        List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book" , Book.class).list();
        return list;
    }

    @Override
    public void update(long id, Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book book2 = session.byId(Book.class).load(id);
        book2.setTitle(book.getTitle());
        book2.setAuthor(book.getAuthor());
        session.flush();
    }

    @Override
    public void delete(long id) {
        Book book = sessionFactory.getCurrentSession().byId(Book.class).load(id);
        sessionFactory.getCurrentSession().remove(book);
    }

}
