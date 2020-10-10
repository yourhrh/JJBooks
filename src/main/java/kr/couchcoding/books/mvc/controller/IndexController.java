package kr.couchcoding.books.mvc.controller;

import kr.couchcoding.books.mvc.service.BookService;
import kr.couchcoding.books.mvc.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
@Slf4j
public class IndexController {
    @Autowired
    IndexService indexService;
    @Autowired
    BookService bookService;

    @GetMapping("")
    public String mainPage(Model model){
        log.info("books : " + bookService.getBooks());
        model.addAttribute("books", bookService.getBooks());

        return "mvc/index/index";
    }
}
