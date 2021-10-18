package com.tsi.training.cread;

import java.util.ArrayList;

public class Book extends Item implements IBorrowable
{
    private int length;


    public Book(String name, int id)
    {
        super(name,id);
    }
    public Book(String name, int id, String genre)
    {
        super(name,id,genre);
    }
    public Book(String name, int id, String genre, ArrayList<String> authors)
    {
        super(name,id,genre,authors);
    }
    public Book(String name, int id, String genre, ArrayList<String> authors, int length)
    {
        super(name,id,genre,authors);
        this.length = length;
    }


    public String view()
    {
        String message = "reading book";
        return message;
    }

    @Override
    public String loan()
    {
        String message = "borrowing book from library";
        return message;

    }

    @Override
    public String returnToLibrary()
    {
        String message = "returning to library";
        return message;
    }

    public int getLength()
    {
        return length;
    }
}
