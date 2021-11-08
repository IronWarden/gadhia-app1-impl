/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class ListOptions {

    // save and load is a combo so they belong in the same class

    public void saveFile(File saveFiles, ObservableList<ListObject> list) {
        try{
            PrintWriter writer = new PrintWriter(saveFiles);
            // turn observable list into a list we can iterate through
            List<ListObject> newList = new ArrayList<>(list);

            int i = 0;
            // write as a file
            while(newList.size() > i) {
                String item = newList.get(i).toString();
                writer.println(item);
                i++;
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<String> openFile(File openFiles) {
        // declare new observable list
        ObservableList<String> events = FXCollections.observableArrayList();
        try{
            Scanner sc = new Scanner(openFiles);
            while(sc.hasNextLine()) {
                events.add(sc.nextLine());
            }
            sc.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return events;

    }

}
