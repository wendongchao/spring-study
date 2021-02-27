package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//注解表明为控制层，相当于一个bean组件
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
