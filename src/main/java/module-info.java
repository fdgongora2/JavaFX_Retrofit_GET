module com.example.demoretrofit {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires gson;
    requires retrofit2.converter.gson;
    requires java.sql;

    opens com.example.demoretrofit to javafx.fxml , gson;
    exports com.example.demoretrofit;
}