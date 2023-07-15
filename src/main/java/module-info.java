module com.example.crud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.dlsc.formsfx;

    opens com.example.crud to javafx.fxml;
    exports com.example.crud;
}