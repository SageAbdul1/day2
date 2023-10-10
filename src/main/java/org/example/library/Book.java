package org.example.library;

public class Book {
    private String name;

    public void setThenameforme(String inputName){
        if (inputName.length()<5) {
            System.out.println("Book name is invalid");
        }else {
            this.name = inputName;
        }

    }

    public String getName(){
        return this.name;
    }
}
