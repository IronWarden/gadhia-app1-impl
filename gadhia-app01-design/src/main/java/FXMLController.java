/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class FXMLController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());

    }
    @FXML
    Button addButton;
    @FXML
    Button clearButton;
    @FXML
    Button deleteButton;
    @FXML
    MenuItem saveButton;
    @FXML
    MenuItem loadButton;
    @FXML
    TextField descriptionTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<ListObject> eventList;

    ObservableList<ListObject> list = FXCollections.observableArrayList();


    @FXML
    private void addEvent() {
        list.add(new ListObject(descriptionTextField.getText(), datePicker.getValue()));
        eventList.setItems(list);
        refresh();
    }

    @FXML
    private void clearList() {
        clearAllItems();
    }

    @FXML
    private void deleteList() {
        initializeEditable();
        deleteItem();
    }

    @FXML
    private void saveList() {
        FileChooser fileChooser = new FileChooser();
        ListOptions listOptions = new ListOptions();
        File savesFile = fileChooser.showSaveDialog(new Stage());
        if(savesFile != null) {
            listOptions.saveFile(savesFile, list);
        }

    }

    @FXML
    private void openList() {
        ListOptions listOptions = new ListOptions();
        FileChooser fileChooser = new FileChooser();
        File openFiles = fileChooser.showOpenDialog(new Stage());
        if(openFiles != null) {
            ObservableList<String> openedList = listOptions.openFile(openFiles);
        }

        // clear the previous list
        list.clear();
        // show the new list

    }




    EditList editList = new EditList();
    @FXML
    private void editList() {
        initializeEditable();
        editList.editList(eventList);

    }
    @FXML
    private void onEditCommit() {
        initializeEditable();
        eventList.getSelectionModel().select(eventList.getEditingIndex());
        eventList.getItems().set(eventList.getEditingIndex(), new ListObject(" tt", LocalDate.MIN));

    }

    // refreshes the description and date
    private void refresh() {
        datePicker.setValue(LocalDate.now());
        descriptionTextField.setText("");
    }

    private void initializeEditable() {
        eventList.setEditable(true);
    }

    public void deleteItem() {
        list.remove(eventList.getEditingIndex());
    }

    public void clearAllItems() {
        list.clear();
    }

}