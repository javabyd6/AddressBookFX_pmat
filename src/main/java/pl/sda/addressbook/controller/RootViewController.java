package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import pl.sda.addressbook.Main;
import pl.sda.addressbook.model.Person;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author pmatusiak
 */
public class RootViewController implements Initializable {

    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> lastnameCol;

    @FXML
    private Label nameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label postcodeLabel;
    @FXML
    private Label telephoneLabel;
    @FXML
    private Label cityLabel;

    @FXML
    private Button newButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button saveButton;

    private Main main;

    private Stage getStage() {
        return stage;
    }

    private Stage stage;

    private Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void loadPerson(){
        System.out.println(getMain().getPersonList());
        personTableView.setItems(getMain().getPersonList());
        nameCol.setCellValueFactory(c -> c.getValue().nameProperty());
        lastnameCol.setCellValueFactory(c -> c.getValue().lastnameProperty());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println(this.main.getPersonList());
    }

    public void selectedPerson() {
        Person person = personTableView.getSelectionModel().getSelectedItem();
        nameLabel.setText(person.getName());
        lastnameLabel.setText(person.getLastname());
        addressLabel.setText(person.getAddress());
        postcodeLabel.setText(person.getPostCode());
        telephoneLabel.setText(person.getTel());
        cityLabel.setText(person.getCity());
    }


    public void newPerson() throws Exception {
        Stage secondStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/newPerson.fxml"));
        loader.load();

        Parent root = loader.getRoot();
        NewPersonAddController newPersonViewController = loader.getController();
        newPersonViewController.setMain(this.main);

        secondStage.setScene(new Scene(root));
        secondStage.show();
    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }
}
