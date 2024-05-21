module com.intelidia.testquerydsl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires com.querydsl.core;
    requires static java.compiler;


    opens com.intelidia.testquerydsl to javafx.fxml,javafx.graphics;
    exports com.intelidia.testquerydsl;



}