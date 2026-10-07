package com.example.mysqldemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField input_host, input_username, input_password, input_database_name;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String dbHost = EnvLoader.get("DB_HOST", "localhost");
        int dbPort = Integer.parseInt(EnvLoader.get("DB_PORT", "3306"));
        String dbUsername = EnvLoader.get("DB_USER", "root");
        String dbPassword = EnvLoader.get("DB_PASSWORD", "");
        String dbDatabaseName = EnvLoader.get("DB_DATABASE","test");

        input_host.setText(dbHost);
        input_username.setText(dbUsername);
        input_password.setText(dbPassword);
        input_database_name.setText(dbDatabaseName);

        // TODO - set spinner number to dbPort dynamically here
    }

    public void handleConnectClick(ActionEvent actionEvent) throws ClassNotFoundException{
        String host = input_host.getText();
        String username = input_username.getText();

        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
