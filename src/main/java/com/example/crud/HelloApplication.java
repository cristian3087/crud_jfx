package com.example.crud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
//BDD


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


       /* try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(URL,USER,PASS);
            Statement statement= cnn.createStatement();
            String sql="select * from producto";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("id") +"   | " + rs.getString("nombre")+"   | " + rs.getString("cantidad")+"   | " + rs.getString("precio"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/

    }

    public static void main(String[] args) {
        launch();
    }
}