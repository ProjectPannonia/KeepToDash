package home.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button btnStudents;

    @FXML
    private Button btnTeachers;

    @FXML
    private Button btnFees;

    @FXML
    private Button btnUsers;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnExit;

    @FXML
    private Pane pnlStatus;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatusMini;
    @FXML
    private GridPane pnFees;

    @FXML
    private GridPane pnUsers;

    @FXML
    private GridPane pnTeachers;

    @FXML
    private GridPane pnSettings;
    @FXML
    private GridPane pnStudents;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleClicks(ActionEvent event) {

        if (event.getSource() == btnStudents) {
            lblStatusMini.setText("/home/students");
            lblStatus.setText("Students");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnStudents.toFront();
        } else if(event.getSource() == btnTeachers) {
            lblStatusMini.setText("/home/teachers");
            lblStatus.setText("Teachers");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnTeachers.toFront();
        }else if(event.getSource() == btnFees) {
            lblStatusMini.setText("/home/fees");
            lblStatus.setText("Fees");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnFees.toFront();
        }else if(event.getSource() == btnUsers) {
            lblStatusMini.setText("/home/users");
            lblStatus.setText("Users");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnUsers.toFront();
        }else if(event.getSource() == btnSettings) {
            lblStatusMini.setText("/home/settings");
            lblStatus.setText("Settings");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
            pnSettings.toFront();
        }
    }

    @FXML
    private void handleClose(ActionEvent event) {
        Platform.exit();
    }
}
