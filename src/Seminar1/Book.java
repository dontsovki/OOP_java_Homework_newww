package Seminar1;

import Seminar1.Library;

public class Book extends Library {
    private String title;
    private  String author;
    private boolean available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }



    public void displayInfo(){
        System.out.println("название - " + this.title + ", автор - " + this.author + ", доступность - " + this.available);
    }
}
