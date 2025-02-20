module edu.farmingdale.module3_w4_labwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.module3_w4_labwork to javafx.fxml;
    exports edu.farmingdale.module3_w4_labwork;
}