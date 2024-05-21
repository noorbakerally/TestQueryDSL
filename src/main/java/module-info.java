module com.intelidia.testquerydsl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;


    opens com.intelidia.testquerydsl to javafx.fxml;
    exports com.intelidia.testquerydsl;
}