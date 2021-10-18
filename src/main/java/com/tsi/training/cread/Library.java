package com.tsi.training.cread;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    static List<Item> itemsInLibrary = new ArrayList<Item>();
    static List<Book> booksOnLoan = new ArrayList<Book>();

    public static String addItem(Item item)
    {
        itemsInLibrary.add(item);
        return "";
    }

    public static String printItemsInLibrary(ArrayList<Item> itemsInLibrary)
    {
        if (itemsInLibrary.isEmpty())
        {
            System.out.println("no items in library");
        }
        else
        {
            for (Item item : itemsInLibrary)
            {
                System.out.println(item.getName());
                System.out.print(item.getAuthors());
                System.out.print(item.getGenre());
                System.out.print(item.getId());
            }
        }
        return "";
    }

    public static String printBooksOnLoan(ArrayList<Book> booksOnLoan)
    {
        if (booksOnLoan.isEmpty())
        {
            System.out.println("no items in library");
        }
        else
        {
            for (Book book : booksOnLoan)
            {
                System.out.println(book.getName());
                System.out.print(book.getAuthors());
                System.out.print(book.getGenre());
                System.out.print(book.getId());
            }
        }
        return "";
    }

    public static String loanItem(String itemName, ArrayList<Item> itemInLibrary)
    {
        for (Item item : itemsInLibrary)
        {
            if((itemName.equals(item.getName())) && item instanceof Book book)
            {
                book.loan();
                booksOnLoan.add(book);
            }
            if(itemName.equals(item.getName()) && item instanceof AudioBook audioBook)
            {
                audioBook.loan();
            }
            else
            {
                System.out.println("item not found");
            }
        }
        return "";
    }

    public static String returnItem(String itemName,ArrayList<Item> itemInLibrary)
    {
        for (Item item : itemsInLibrary)
        {
            if(itemName.equals(item.getName()) && item instanceof Book book)
            {
                book.returnToLibrary();
                booksOnLoan.remove(book);
            }
            if(itemName.equals(item.getName()) && item instanceof AudioBook audioBook)
            {
                audioBook.returnToLibrary();
            }
            else
            {
                System.out.println("item not found");
            }
        }
        return "";
    }
    public static String runLibrary()
    {


        /*Book book2 = new Book("Sapiens",14,"non-fiction",new ArrayList<>(List.of("Yuval Noah Harari")),400);
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
        }*/
        return "library";

    }


}
