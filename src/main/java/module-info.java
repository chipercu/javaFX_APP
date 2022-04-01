module ru.cav.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.cav.demo to javafx.fxml;
    exports ru.cav.demo;
    exports ru.cav.demo.app;
    opens ru.cav.demo.app to javafx.fxml;
}