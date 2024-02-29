module com.example.compscijavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compscijavafx to javafx.fxml;
    exports com.example.compscijavafx;
}