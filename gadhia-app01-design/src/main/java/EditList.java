/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import java.util.ArrayList;

public class EditList {
    // all members belong in this class because they all modify a single to-do list
    // takes a single list and allows the user to manipulate the content
    public ArrayList<LocalEvent> editDescription(LocalEvent list, LocalEvent user, String edit) {
        // takes the list of lists and the to-do list the user want to edit
        // take in the list as a string and use regex to edit only that part of the string
        //  return the new list of lists

        return null;
    }

    public ArrayList<LocalEvent> editDueDate(LocalEvent list, LocalEvent user, String edit) {
        // takes the list of lists and the to-do list the user want to edit
        // take in the list as a string and use regex to edit only the date which will be preceded by 'date'
        //  return the new list of lists

        return null;
    }

    public ArrayList<LocalEvent> addNewItem(LocalEvent list, LocalEvent user, String edit) {
        // takes in the list of lists and add an item in string format to the existing list
        // use list.add
        // return the list of lists
        return null;
    }

    public ArrayList<LocalEvent> deleteItem(LocalEvent localEvent, LocalEvent user, int number) {
        // delete the item that the user want to delete by iterating through the list of lists to find
        // the exisitng list and then deleting the item in arraylist specfied by number
        // return the new list of lists

        return null;
    }
}
