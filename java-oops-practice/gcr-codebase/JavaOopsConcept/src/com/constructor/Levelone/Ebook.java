package com.constructor.levelone;
// subclass
public class Ebook extends Library {
	double fileSize; // in MB

    Ebook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
    void displayEBookDetails() {
        System.out.println("ISBN     : " + ISBN);     
        System.out.println("Title    : " + title);       
        System.out.println("Author   : " + getAuthor()); 
        System.out.println("FileSize : " + fileSize + " MB");
    }

}
