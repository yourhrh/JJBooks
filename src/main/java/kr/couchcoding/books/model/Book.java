package kr.couchcoding.books.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
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

    public void addGenre(String genre){
        if(genres == null){
            genres = new ArrayList<>();
        }
        genres.add(genre);
    }
}
