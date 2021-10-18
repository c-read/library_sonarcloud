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
    public String loan()
    {
        String message = "audiobook has been downloaded";
        System.out.println(message);
        return message;
    }


    @Override
    public String returnToLibrary()
    {
        String message = "returning to library";
        System.out.println(message);
        return message;
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
