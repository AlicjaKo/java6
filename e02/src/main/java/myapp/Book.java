package myapp;

public class Book {
    private String title;
    private String author;
    private int year;


    public Book (String tit, String auth, int yea) {
        this.author = auth;
        this.title = tit;
        this.year = yea;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }

}
