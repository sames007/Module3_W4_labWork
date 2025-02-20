package edu.farmingdale.module3_w4_labwork;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import java.io.IOException;

public class SplashScreenController {

    @FXML
    private void handleContinue(ActionEvent event) throws IOException {
            Parent landingRoot = FXMLLoader.load(getClass().getResource("LandingScreen.fxml"));
            Scene scene = ((Node) event.getSource()).getScene();
            scene.setRoot(landingRoot);
    }
}