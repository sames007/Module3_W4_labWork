package edu.farmingdale.module3_w4_labwork;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import java.io.IOException;

public class SplashScreenController {

    @FXML
    private void Continue(ActionEvent event) throws IOException {
        Scene scene = ((ImageView) event.getSource()).getScene();
        scene.setRoot(new FXMLLoader(HelloApplication.class.getResource("landing_screen.fxml")).load());
    }
}