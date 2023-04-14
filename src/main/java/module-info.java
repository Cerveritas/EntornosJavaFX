module com.example.entornosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.entornosjavafx to javafx.fxml;
    exports com.example.entornosjavafx;
}