module com.example.week11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week11 to javafx.fxml;
    exports com.example.week11;
}