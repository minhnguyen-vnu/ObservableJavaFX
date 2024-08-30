module com.jmc.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.jdi;


    opens com.jmc.demo2 to javafx.fxml;
    exports com.jmc.demo2;
}