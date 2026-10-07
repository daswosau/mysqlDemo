module com.example.mysqldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mysqldemo to javafx.fxml;
    exports com.example.mysqldemo;
}