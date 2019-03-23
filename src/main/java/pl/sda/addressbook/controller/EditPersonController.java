package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.addressbook.Main;

import java.awt.*;

/**
 * @author pmatusiak
 */
public class EditPersonController {

    @FXML
    private javafx.scene.control.TextField nameEdit;
    @FXML
    private javafx.scene.control.TextField lastnameEdit;
    @FXML
    private javafx.scene.control.TextField addressEdit;
    @FXML
    private javafx.scene.control.TextField telEdit;
    @FXML
    private javafx.scene.control.TextField postcodeEdit;
    @FXML
    private javafx.scene.control.TextField cityEdit;

    @FXML
    private javafx.scene.control.Button editPersonSaveButton;
    @FXML
    private Button editPersonEscButton;

    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }


}
