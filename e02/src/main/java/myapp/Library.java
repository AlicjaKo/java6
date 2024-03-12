package myapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void readBooksFomFile() throws IOException {
        try (Stream<String> st = Files.lines(Path.of("../resources/books.txt"))) {
            st
            .map(line -> line.split(", "))
            .forEach(el -> {
                Book book = new Book(el[0], el[1],  Integer.parseInt(el[2]));
                books.add(book);
            });
        } catch (IOException e) {
            throw e;
        }
    }

    public int size() {
        return books.size();
    }

    public int earliestYear() {
        return books.stream()
                    .mapToInt(book -> book.getYear())
                    .min()
                    .orElse(0); 
    }

    public int latestYear() {
        return books.stream()
                    .mapToInt(book -> book.getYear())
                    .max()
                    .orElse(0); 
    }

    public long search(int publishingYear) {
        return books.stream()
                    .filter(book -> book.getYear() > publishingYear)
                    .count();
    }

    public List<String> titles() {
        return books.stream()
                    .map(book -> book.getTitle())
                    .collect(Collectors.toList());
    }

}
