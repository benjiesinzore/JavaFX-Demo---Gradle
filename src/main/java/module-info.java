module com.benjaminsinzore.javafx_demo_gradle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.benjaminsinzore.javafx_demo_gradle to javafx.fxml;
    exports com.benjaminsinzore.javafx_demo_gradle;
}