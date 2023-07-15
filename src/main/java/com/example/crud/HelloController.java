package com.example.crud;

import clases.Conex;
import clases.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView<String> listaDatos;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onBtnMostrarClick() throws SQLException {
        Alert msn =new Alert(Alert.AlertType.INFORMATION);
        msn.setTitle("Mostrar");
        msn.setContentText("Este es un mensaje para mostrar los registros generados en la BDD");
        //msn.show();

        ObservableList<String> datos = FXCollections.observableArrayList();
        ResultSet rs=Conex.query("Select * from producto;");
        while (rs.next()){
            datos.add(rs.getString("id") +"   | " + rs.getString("nombre")+"   | " + rs.getString("cantidad")+"   | " + rs.getString("precio"));
        }
        listaDatos.setItems(datos);

    }
}