package com.simengine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class headerexp extends Application {
    @Override
    public void start(Stage headerStage) {
 
        SceneHeader sh = new SceneHeader();
        Scene sc = sh.createHeaderScene("Mechanics", "Mechanics is a fundamental branch of physics that studies the motion of objectsand the forces that cause or change this motion.", "\"Explore and visualize projectile trajectories in 2D physics. Experiment with angle, velocity, and gravity!");
        headerStage.setScene(sc);
        headerStage.setTitle("Main Header Expansion");
        headerStage.setResizable(false);
        headerStage.show();
    }

}
