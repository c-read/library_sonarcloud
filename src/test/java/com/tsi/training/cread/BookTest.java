package com.tsi.training.cread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest
{

    @Test
    public void testBookGetNameMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("message","Enlightenment",book.getName());
    }
    @Test
    public void testBookGetIdMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("message",24,book.getId());
    }
    @Test
    public void testBookGetGenreMethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("failed to get genre","non-fiction",book.getGenre());
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
        assertEquals("message","borrowing book from library",book.loan());
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
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","Captain Underpants",audioBook.getName());
    }
    @Test
    public void testAudioBookGetIdMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message",4,audioBook.getId());
    }
    @Test
    public void testAudioBookGetGenreMethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","fiction",audioBook.getGenre());
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
    public void testAudioBookloanmethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","audiobook has been downloaded",audioBook.loan());
    }
    @Test
    public void testAudioBookreturnmethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","returning to library",audioBook.returnToLibrary());

    }
}
