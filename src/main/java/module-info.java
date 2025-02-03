module it.uniroma2.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.uniroma2.demo to javafx.fxml;
    exports it.uniroma2.demo;
}