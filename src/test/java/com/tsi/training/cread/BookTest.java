package com.tsi.training.cread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest
{
    @Test
    public void testBookloanmethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("message","Enlightenment",book.getName());
        assertEquals("message",24,book.getId());
        assertEquals("failed to get genre","non-fiction",book.getGenre());
        assertEquals("message",600,book.getLength());
        assertEquals("message","borrowing book from library",book.loan());
    }


    @Test
    public void testBookreturnmethod()
    {
        Book book = new Book("Enlightenment", 24,"non-fiction",new ArrayList<>(List.of("Roy Porter")),600);
        assertEquals("failed to return","returning to library",book.returnToLibrary());
    }

    @Test
    public void testAudioBookloanmethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","Captain Underpants",audioBook.getName());
        assertEquals("message",4,audioBook.getId());
        assertEquals("failed to get genre","fiction",audioBook.getGenre());
        assertEquals("message",100,audioBook.getSizeMb());
        assertEquals("message","audiobook has been downloaded",audioBook.loan());

    }

    @Test
    public void testAudioBookreturnmethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message",100,audioBook.getSizeMb());
        assertEquals("message","returning to library",audioBook.returnToLibrary());

    }
}
