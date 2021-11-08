/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */


import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;


// incomplete class, tried to set up cell factory to create editable cells

public class EditList {

    public void editList(ListView<ListObject> listview) {

        listview.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(ListObject item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null || item.getLocalEvent() == null) {
                    setText(null);
                } else {
                    setText(item.toString());

                }
            }
        });
        listview.setEditable(true);
        listview.getSelectionModel().select(listview.getEditingIndex());
        listview.setOnEditStart(event -> {

        });
        listview.setOnEditCommit(event -> listview.getItems().set(event.getIndex(), event.getNewValue()));

        listview.setOnEditCancel(event -> {

        });


    }

}
