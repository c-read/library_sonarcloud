package com.tsi.training.cread;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Item> itemsInLibrary = new ArrayList<Item>();


        Book book2 = new Book("Sapiens",14,"non-fiction",new ArrayList<>(List.of("Yuval Noah Harari")),400);
        itemsInLibrary.add(book2);
        book2.loan();

        Book book1 = new Book("Harry Potter",15, "fiction", new ArrayList<>(List.of("J.K. Rowling")));
        itemsInLibrary.add(book1);

        AudioBook ab1 = new AudioBook("Waking Up",12,"non-fiction",new ArrayList<>(List.of("Sam Harris")),50);
        itemsInLibrary.add(ab1);


        System.out.println("Library contents");
        System.out.print("Name / ID /  Authors  /  Type  /  Genre ");
        System.out.println();

        for (Item item : itemsInLibrary)
        {
            System.out.print(item.getName() + " ");
            System.out.print(item.getId() + " ");
            System.out.print(item.getAuthors() + " ");
            System.out.print(item.getClass().getSimpleName() + "  ");
            System.out.print(item.getGenre() + " ");
            System.out.println();
        }


    }
}
