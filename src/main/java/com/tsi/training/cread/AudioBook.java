package com.tsi.training.cread;

import java.util.ArrayList;

public class AudioBook extends Item implements IBorrowable
{

    private int sizeMb;

    public AudioBook(String name, int id)
    {
        super(name,id);
    }
    public AudioBook(String name, int id, String genre)
    {
        super(name,id,genre);
    }
    public AudioBook(String name, int id, String genre, ArrayList<String> authors)
    {
        super(name,id,genre,authors);
    }
    public AudioBook(String name, int id, String genre, ArrayList<String> authors, int sizeMb)
    {
        super(name,id,genre,authors);
        this.sizeMb = sizeMb;
    }
    public void view()
    {
        System.out.println("listening to audiobook");
    }


    @Override
    public void loan()
    {
        System.out.println("audiobook downloaded");
    }


    @Override
    public void returnToLibrary()
    {
        System.out.println("returning to library");
    }

    public int getSizeMb()
    {
        return sizeMb;
    }
    public void setSizeMb(int size)
    {
        this.sizeMb = sizeMb;
    }

}
