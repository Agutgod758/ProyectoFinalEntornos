module com.example.interfazmbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfazmbc to javafx.fxml;
    exports com.example.interfazmbc;
}