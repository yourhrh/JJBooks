package kr.couchcoding.books.mvc.controller;

import kr.couchcoding.books.model.Book;
import kr.couchcoding.books.mvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/sampleBook")
    @ResponseBody
    public Book getSampleBook(){
        return testService.getSampleBookInfo();
    }

    @GetMapping("/secondBook")
    @ResponseBody
    public Book getSecondBook(){
        return testService.getSecondBook();
    }

    @GetMapping("/testString")
    @ResponseBody
    public String getTestString(){
        return testService.getTestString();
    }

    @GetMapping("/sampleComponent")
    @ResponseBody
    public String getSampleName(){
        return testService.getSampleName();
    }
}
