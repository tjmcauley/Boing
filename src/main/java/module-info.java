module com.example.boingv4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boingv4 to javafx.fxml;
    exports com.example.boingv4;
}