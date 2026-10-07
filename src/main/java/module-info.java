module com.example.mysqldemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.github.cdimascio.dotenv.java;


    opens com.example.mysqldemo to javafx.fxml;
    exports com.example.mysqldemo;
}