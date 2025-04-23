package Views;

import models.Book;

public class ViewConsole {

    public void printArray(Book[] books){
        for(Book books : books);
        System.out.println(books);
    }

    public void printMessage(String message){
        System.out.println(message);
    }
    
}
