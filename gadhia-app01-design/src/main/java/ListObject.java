/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import java.time.LocalDate;

public class ListObject {

    private String description;
    private LocalDate date;

    // creates a local event object
    public ListObject(String description, LocalDate date) {
        this.setDate(date);
        this.setDescription(description);

    }

    // methods to set/get the description and date
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        if(description.length() > 256) {
            this.description = null;
        }
        else {
            this.description = description;
        }

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocalEvent() {
        return "At :" + this.getDate() + " " + this.getDescription();
    }

    // returns to the user as a list
    @Override
    public String toString(){
        return "At :" + this.getDate() + " " + this.getDescription();
    }



}
