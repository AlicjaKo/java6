package myapp;

import java.io.IOException;

final class App {
    public static void main(final String[] args) {
        Library library = new Library();

        try {
            library.readBooksFomFile();
            System.out.println(library.size());
            System.out.println(library.earliestYear());
            System.out.println(library.latestYear());
            System.out.println(library.search(2022));
            System.out.println(library.titles());
        
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        

        

    }
}
