package kr.couchcoding.books.mvc.service;

import kr.couchcoding.books.components.SampleComponent;
import kr.couchcoding.books.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class TestService {
    @Value("${application.test}")
    String testString;
    @Autowired
    Book sampleBook;
    @Resource(name="secondBook")
    Book secondBook;
    @Autowired
    SampleComponent sampleComponent;


    public String getTestString() {
        return "test String은 " + testString + "이다";
    }

    public Book getSampleBookInfo(){
        log.info("Slf4j sample Book : " + sampleBook.toString());
        return sampleBook;
    }

    public Book getSecondBook(){
        return secondBook;
    }

    public String getSampleName(){
        return sampleComponent.getName();
    }
}
