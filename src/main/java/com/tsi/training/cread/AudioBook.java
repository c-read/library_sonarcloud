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
    public String view()
    {
        return "listening to audiobook";
    }


    @Override
    public String loan()
    {
        return "audiobook has been downloaded";
    }


    @Override
    public String returnToLibrary()
    {
        return "rental over - audiobook is being deleted";
    }



    public int getSizeMb()
    {
        return sizeMb;
    }

}
