package com.tsi.training.cread;

import java.util.ArrayList;

public abstract class Item
{

    /*attributes*/

    private String name;
    private int id;
    private String genre;
    private ArrayList<String> authors;


    /*constructors*/

    public Item(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public Item(String name, int id, String genre)
    {
        this.name = name;
        this.id = id;
        this.genre  = genre;
    }
    public Item(String name, int id, String genre, ArrayList<String> authors)
    {
        this.name = name;
        this.id = id;
        this.genre  = genre;
        this.authors = authors;
    }

    /*methods*/

    public abstract String view();




    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }


    public ArrayList<String> getAuthors()
    {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors)
    {
        this.authors = authors;
    }




}
