import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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
    Button editButton;
    @FXML
    TextField descriptionTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;




    ObservableList<LocalEvent> list = FXCollections.observableArrayList();


    @FXML
    private void addEvent(Event event) {
        list.add(new LocalEvent(descriptionTextField.getText(), datePicker.getValue()));
        eventList.setItems(list);
        refresh();
    }

    @FXML
    private void clearList(Event event) {
        list.clear();
    }

    @FXML
    private void deleteList() {
        initializeEditable();

        list.remove(eventList.getEditingIndex());
    }




    private void refresh() {
        datePicker.setValue(LocalDate.now());
        descriptionTextField.setText(null);
    }

    private void initializeEditable() {
        eventList.setEditable(true);
    }

}