module ru.cav.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.cav.demo to javafx.fxml;
    exports ru.cav.demo;
}