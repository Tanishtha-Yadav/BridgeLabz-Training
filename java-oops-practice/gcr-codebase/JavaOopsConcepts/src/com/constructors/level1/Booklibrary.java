package com.constructors.level1;

// Public class
public class Booklibrary
{
    // Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Booklibrary(String ISBN, String title, String author)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public static void main(String[] args)
    {
        EBook eb = new EBook("978-0134685991","Effective Java","Joshua Bloch","PDF");

        eb.displayDetails();

        eb.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}


class EBook extends Booklibrary
{
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat)
    {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void displayDetails()
    {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Format: " + fileFormat);
    }
}
