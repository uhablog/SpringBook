package com.uhablog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uhablog.model.Book;
import com.uhablog.service.BookService;

@Controller
public class BookController {
	
    @Autowired
    BookService service;
	
    @GetMapping("/book-list")
    public String bookList(Model model) {
		
        // serviceを使って、本の一覧をDBから取得する
        List<Book> bookList = service.findAll();
        // modelに本の一覧を設定して、画面に渡す
        model.addAttribute("bookList", bookList);
        // bookList.htmlの表示
        return "bookList";
    }
}
