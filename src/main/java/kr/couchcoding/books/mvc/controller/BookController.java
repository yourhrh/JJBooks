package kr.couchcoding.books.mvc.controller;

import kr.couchcoding.books.model.Book;
import kr.couchcoding.books.mvc.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/form")
    @ResponseBody
    public Map<String, Object> addBookForm(@ModelAttribute Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/json")
    @ResponseBody
    public Map<String, Object> addBookJson(@RequestBody Book book){
        return bookService.addBook(book);
    }
    
    @GetMapping("")
    @ResponseBody
    public Map<String, Object> getBookParam(@RequestParam String name){
        return bookService.getBook(name);
    }

    @GetMapping("/{isbn}")
    public String getBookPath(@PathVariable String isbn, Model model){
        log.info("input isbn : " + isbn);
        return "mvc/index/index2";
    }
    
//    @GetMapping("")
//    @ResponseBody
//    public List<Map<String, Object>> getBooks(){
//        return bookService.getBooks();
//    }
}
