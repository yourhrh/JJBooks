package kr.couchcoding.books.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Book {
    String isbn;
    String name;
    List<String> genres;
    String author;
    String company;
    int price;
    String created;
    String imgSrc;
    String shortContents;
    String contents;
}
