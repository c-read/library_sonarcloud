package com.tsi.training.cread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest
{
    @Test
    public void testRunLibraryMethod()
    {
        assertEquals("library run failed","library",Library.runLibrary());
    }

    @Test
    public void testBookGetNameMethod()
    {
        Book book = new Book("Enlightenment", 24);
        assertEquals("message","Enlightenment",book.getName());
    }

    @Test
    public void testBookGetIdMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction");
        assertEquals("message",24,book.getId());
    }
    @Test
    public void testBookGetGenreMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")));
        assertEquals("failed to get genre","non-fiction",book.getGenre());
    }
    @Test
    public void testGetAuthorsMethod()
    {
        ArrayList<String> authors = new ArrayList<>(List.of("Roy Porter"));
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("failed to return",authors,book.getAuthors());
    }
    @Test
    public void testBookGetLengthMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("message",600,book.getLength());
    }
    @Test
    public void testBookViewMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("failed to return","reading book",book.view());
    }
    @Test
    public void testBookloanmethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("message","book has been loaned out",book.loan());
    }
    @Test
    public void testBookreturnmethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("failed to return","returning to library",book.returnToLibrary());
    }


    @Test
    public void testAudioBookGetNameMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4);
        assertEquals("message","Captain Underpants",audioBook.getName());
    }
    @Test
    public void testAudioBookGetIdMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction");
        assertEquals("message",4,audioBook.getId());
    }
    @Test
    public void testAudioBookGetGenreMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction");
        assertEquals("message","fiction",audioBook.getGenre());
    }
    @Test
    public void testAudioBookGetAuthorsMethod()
    {
        ArrayList<String> authors = new ArrayList<>(List.of("na"));
        AudioBook audioBook = new AudioBook("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("na")));
        assertEquals("failed to return",authors,audioBook.getAuthors());
    }
    @Test
    public void testAudioBookGetSizeMbMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message",100,audioBook.getSizeMb());
    }
    @Test
    public void testAudioBookViewMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("failed to return","listening to audiobook",audioBook.view());
    }
    @Test
    public void testAudioBookLoanMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","audiobook has been downloaded",audioBook.loan());
    }
    @Test
    public void testAudioBookReturnMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","rental over - audiobook is being deleted",audioBook.returnToLibrary());

    }

    @Test
    public void testAddItem()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        assertEquals("message", "",Library.addItem(book,itemsInLibrary));
    }

    @Test
    public void testPrintLibraryItems()
    {
        Item book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        assertEquals("message", "",Library.printItemsInLibrary(libraryItems));
    }
    @Test
    public void testPrintLibraryItemsEmpty()
    {
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        assertEquals("message","",Library.printItemsInLibrary(itemsInLibrary));
    }
    @Test
    public void testPrintBooksOnLoan()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        itemsInLibrary.add(book);
        Library.loanItem(book.getName(),itemsInLibrary,booksOnLoan);
        assertEquals("message", "",Library.printBooksOnLoan(booksOnLoan));
    }
    @Test
    public void testPrintBooksOnLoanEmpty()
    {
        ArrayList<Book> booksOnLoan = new ArrayList<>(0);
        assertEquals("message","",Library.printBooksOnLoan(booksOnLoan));
    }


    @Test
    public void testLoanItemBook()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        itemsInLibrary.add(book);
        assertEquals("message", "",Library.loanItem(book.getName(),itemsInLibrary,booksOnLoan));
    }
    @Test
    public void testLoanItemAudioBook()
    {
        AudioBook audioBook = new AudioBook("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),100);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        itemsInLibrary.add(audioBook);
        assertEquals("message", "",Library.loanItem(audioBook.getName(),itemsInLibrary,booksOnLoan));
    }
    @Test
    public void testLoanItemEmpty()
    {
        AudioBook audioBook = new AudioBook("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        assertEquals("message","",Library.loanItem(audioBook.getName(),itemsInLibrary,booksOnLoan));
    }

    @Test
    public void testReturnItemBook()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>(0);
        itemsInLibrary.add(book);
        assertEquals("message", "",Library.returnItem(book.getName(),itemsInLibrary,booksOnLoan));
    }
    @Test
    public void testReturnItemAudioBook()
    {
        AudioBook audioBook = new AudioBook("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        itemsInLibrary.add(audioBook);
        assertEquals("message", "",Library.returnItem(audioBook.getName(),itemsInLibrary,booksOnLoan));
    }
    @Test
    public void testReturnItemEmpty()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        ArrayList<Item> itemsInLibrary = new ArrayList<>();
        ArrayList<Book> booksOnLoan = new ArrayList<>();
        assertEquals("message", "",Library.returnItem("En",itemsInLibrary,booksOnLoan));
    }

}
