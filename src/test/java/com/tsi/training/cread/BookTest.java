package com.tsi.training.cread;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest
{
    @Test
    public void testBookloanmethod()
    {
        Book book = new Book("Enlightenment", 24);
        assertEquals("message","Enlightenment",book.getName());
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
        AudioBook audioBook = new AudioBook("Captain Underpants", 4);
        assertEquals("message","Captain Underpants",audioBook.getName());
    }
}
