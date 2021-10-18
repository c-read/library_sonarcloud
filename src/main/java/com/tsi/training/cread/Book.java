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


    public void view()
    {
        System.out.println("reading book");
    }

    @Override
    public void loan()
    {
        System.out.println("borrowing book from library");

    }

    @Override
    public void returnToLibrary()
    {
        String message = "returning to library";
        System.out.println(message);
    }

    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
}
