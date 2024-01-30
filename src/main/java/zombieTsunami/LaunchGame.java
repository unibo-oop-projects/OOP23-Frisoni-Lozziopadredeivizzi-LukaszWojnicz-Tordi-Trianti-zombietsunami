package zombieTsunami;

import zombieTsunami.api.Controller;
import zombieTsunami.controller.ControllerImpl;

public class LaunchGame {
    
    public static void main(String[] args) {
        final Controller controller = new ControllerImpl();
        controller.setModel();
        controller.setView();
    }
}
