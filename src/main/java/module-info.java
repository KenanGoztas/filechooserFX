module com.example.filechooserfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filechooserfx to javafx.fxml;
    exports com.example.filechooserfx;
}