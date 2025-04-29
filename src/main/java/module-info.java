module edu.umn.d.mclau448.robynplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.umn.d.mclau448.robynplanner to javafx.fxml;
    exports edu.umn.d.mclau448.robynplanner;
}