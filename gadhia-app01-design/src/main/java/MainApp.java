/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DefaultStringConverter;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());



        stage.setTitle("ToDoListApp");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);


    }

    // display all different items using overload
    void display(LocalEvent incomplete, LocalEvent complete) {

    }

    void display( LocalEvent complete) {

    }

    void displayIncompleteList(LocalEvent incomplete) {

    }


}