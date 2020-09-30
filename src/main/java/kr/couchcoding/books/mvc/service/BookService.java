package kr.couchcoding.books.mvc.service;

import kr.couchcoding.books.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class BookService {
    Map<String, Object> books = new HashMap<>();

    public Map<String, Object> addBook(Book book){
        log.info("Add new book: " + book);

        Map<String, Object> res = new HashMap<>();

        if(books.containsKey(book.getName())){
            res.put("result", "fail");
            res.put("data", book);
        } else {
            books.put(book.getName(), book);
            res.put("result", "success");
            res.put("data", book);
        }
        return res;
    }

    public Map<String, Object> getBook(String name) {
        Map<String, Object> res = new HashMap<>();
        if(books.containsKey(name)){
            res.put("result", "success");
            res.put("data", books.get(name));
        } else {
            res.put("result", "fail");
        }
        return res;
    }
}
