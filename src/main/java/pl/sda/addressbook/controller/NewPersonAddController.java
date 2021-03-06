package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.sda.addressbook.Main;
import pl.sda.addressbook.model.Person;

import java.io.IOException;

/**
 * @author pmatusiak
 */
public class NewPersonAddController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField telField;
    @FXML
    private TextField postcodeField;
    @FXML
    private TextField cityField;

    @FXML
    private Button newPersonSaveButton;
    @FXML
    private Button newPersonEscButton;

    private Main main;

    private Main getMain() {
        return main;
    }

    void setMain(Main main) {
        this.main = main;
    }

    public void saveNewPerson() throws IOException {
        Person person = new Person(nameField.getText(), lastnameField.getText(), addressField.getText(), telField.getText(), postcodeField.getText(), cityField.getText());
        getMain().getPersonList().add(person);
        Stage stage = (Stage) newPersonSaveButton.getScene().getWindow();
        stage.close();
    }

    public void escape() {
        Stage stage = (Stage) newPersonEscButton.getScene().getWindow();
        stage.close();
    }
}
