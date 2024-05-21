module com.intelidia.testquerydsl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires com.querydsl.core;
    requires java.compiler;


    opens com.intelidia.testquerydsl to javafx.fxml;
    exports com.intelidia.testquerydsl;
}