package com.adammcquistan.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXApp extends Application {
    public static void main(String[] args) {
        System.out.println("Hello");
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
    	String javaVersion = System.getProperty("java.version");
    	String javaFXVersion = System.getProperty("javafx.version");
    	Label lbl = new Label("Hello OpenJFX " + javaFXVersion + ", running on Open JDK " + javaVersion);
    	Scene scene = new Scene(lbl, 640, 480);
    	stage.setScene(scene);
    	stage.show();
    }
}
