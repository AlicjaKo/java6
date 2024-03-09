package myapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() throws IOException {
        library = new Library();
        library.readBooksFomFile();
    }

    @Test
    void testSize() {
        assertEquals(12, library.size());
    }

    @Test
    void testEarliestYear() {
        assertEquals(1813, library.earliestYear());
    }

    @Test
    void testLatestYear() {
        assertEquals(2003, library.latestYear());
    }

    @Test
    void testSearch() {
        assertEquals(1, library.search(2000));
    }

    @Test
    void testTitles() {
        assertEquals(List.of("To Kill a Mockingbird", "The Great Gatsby", "1984", "The Catcher in the Rye", "The Lord of the Rings", "Pride and Prejudice", "The Hitchhiker's Guide to the Galaxy", "The Da Vinci Code", "To the Lighthouse", "One Hundred Years of Solitude", "The Color Purple", "Harry Potter and the Philosopher's Stone"), library.titles());
    }
}
