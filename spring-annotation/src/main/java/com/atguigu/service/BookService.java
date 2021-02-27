package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

//注解表明为应用层，表明为组件，并放到容器中
@Service
public class BookService {

//    @Qualifier("bookDao")
    @Autowired(required = false)
//    @Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }
    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}
