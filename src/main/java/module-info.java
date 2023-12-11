module planeapp.paneapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
    requires com.dlsc.formsfx;
    requires javafx.base;
    opens Admin to javafx.fxml;
    opens Database to javafx.fxml;
    opens Customer.Controller to javafx.fxml;

    exports Customer.Controller;
    exports Database;
    exports Admin;
    exports Customer;

}