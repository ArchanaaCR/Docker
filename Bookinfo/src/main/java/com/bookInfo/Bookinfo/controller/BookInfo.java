package com.bookInfo.Bookinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookinfo")
public class BookInfo {

    @GetMapping("/bookname")
    public String getBookInfo(){
        return "The book name is ikkigai";
    }
}

