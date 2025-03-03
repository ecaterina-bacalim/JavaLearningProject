package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private String name;

   private List<Book> bookStock;


    public Library (String name) {
        this.name = name;
        bookStock = new ArrayList<>();
    }

    public void addBook(Book formalParametrBook){
        if (bookStock.add(formalParametrBook)) {
            System.out.println("The book has been added: " + formalParametrBook.getTitle() + "; author: " + formalParametrBook.getAuthor());
        } else {
            System.out.println("The book has not been added");

        }
    }

    public int getTheNumberOfBooksInTheStock(){
        return bookStock.size();
    }

    public boolean isBookPresent (Book formalBook){
    return bookStock.contains(formalBook);
    }

    public void printBookTitle (){
        for (int i =0; i<bookStock.size(); i++){
            System.out.println("The book number "+ i + " Book Title: "+ bookStock.get(i).getTitle());
        }
    }
}
