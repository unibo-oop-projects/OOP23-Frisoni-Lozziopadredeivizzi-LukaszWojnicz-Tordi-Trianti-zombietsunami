package main.java.zombieTsunami;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.controller.ControllerImpl;
import main.java.zombieTsunami.view.View;

public class LaunchGame {
    
    public static void main(String[] args) {
        final Controller controller = new ControllerImpl();
        controller.setModel();
        controller.setView();
    }
}
