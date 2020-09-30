package kr.couchcoding.books.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Book {
    String isbn;
    String name;
    List<String> genres;
    String author;
    int price;
    Date created;
    String shortContents;
    String contents;
}
