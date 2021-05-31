/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11library;

/**
 *
 * @author emmadebarros
 */
public class Book {

    int id;
    String isbn; // 13 or 10, with hyphens, use varchar(20), require numbers and hyphens only, last character may be X (uppercase)
    String titleAndAuthor; // 2-200 characters, any
    byte[] coverImage; // BLOB, may be null

    public Book(int id, String isbn, String titleAndAuthor, byte[] coverImage) {
        this.id = id;
        this.isbn = isbn;
        this.titleAndAuthor = titleAndAuthor;
        this.coverImage = coverImage;
    }

    @Override
    public String toString() {
        return String.format("Book #%d, ISBN: %s, Title&Author: %s", id, isbn, titleAndAuthor);
    }
    
}
