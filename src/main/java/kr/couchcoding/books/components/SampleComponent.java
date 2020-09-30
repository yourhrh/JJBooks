package kr.couchcoding.books.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

    @Value("${sample.name}")
    String name;

    public String getName(){
        return name;
    }
}
