/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import java.time.LocalDate;

public class LocalEvent {
    private String description;
    private LocalDate date;



    // all members belong in this class because they add or delete a list
    // function to add a list
    public LocalEvent(String description, LocalDate date) {
        this.setDate(date);
        this.setDescription(description);


        // the title will already be atleast 3 characters long
        // function to add a list will take the title, description, and date as parameters
        // and create a list of strings
        // this list of strings will be added to a list of lists


    }

    // function to remove list
    public void remove(LocalEvent list) {
        // function to remove list will take the list of lists and the list the user
        // wants to delete, and delete it with an arraylist function

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "At :" + this.getDate() + " " + this.getDescription();
    }
}
