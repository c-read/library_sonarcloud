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
        assertEquals("message",600,book.getLength());
    }


    @Test
    public void testBookreturnmethod()
    {
        Book book = new Book("Enlightenment", 24);
        assertEquals("message","Enlightenment",book.getName());
    }

    @Test
    public void testAudioBookloanmethod()
    {
        AudioBook audioBook = new AudioBook("Captain Underpants", 4,"fiction",new ArrayList<>(List.of("na")),100);
        assertEquals("message","Captain Underpants",audioBook.getName());
        assertEquals("message",100,audioBook.getSizeMb());

    }
}
