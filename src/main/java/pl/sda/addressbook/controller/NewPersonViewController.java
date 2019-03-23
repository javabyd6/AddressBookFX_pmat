package pl.sda.addressbook.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.sda.addressbook.Main;
import pl.sda.addressbook.model.Person;

/**
 * @author pmatusiak
 */
public class NewPersonViewController {

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

    public void saveNewPerson(){
        Person person = new Person(nameField.getText(), lastnameField.getText(), addressField.getText(), telField.getText(), postcodeField.getText(),cityField.getText());
        main.getPersonList().add(person);
        Stage stage = (Stage) newPersonSaveButton.getScene().getWindow();
        stage.close();
    }
    public void escape(){
        Stage stage = (Stage) newPersonEscButton.getScene().getWindow();
        stage.close();
    }
}
