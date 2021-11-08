/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ListOptionsTest {
    @Test
    void test_if_list_is_saved() {
        ListOptions listOptions = new ListOptions();

        File saveFiles = new File("../Documents/");
        ObservableList<ListObject> list = FXCollections.observableArrayList();
        list.add(new ListObject("a", LocalDate.MIN));
        listOptions.saveFile(saveFiles, list);

        assertTrue(saveFiles.exists());
    }

}