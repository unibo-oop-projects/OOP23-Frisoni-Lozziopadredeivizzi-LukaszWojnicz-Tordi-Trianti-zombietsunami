package zombietsunami.view;

import zombietsunami.view.api.VController;

public class VCollision {

    public static boolean checkCollision(VController controller) {
        for(int i = 0; i < controller.getBombListC().size(); i++)  {
            if(controller.getBombListC().get(i) != null) {
                if(controller.getZombieScreenY() == controller.getBombListC().get(i).getY()) { //condizione NON FUNZIONANTE
                    /*
                    System.out.println("Zombie:");
                    System.out.println("X: " + controller.getZombieScreenX());
                    System.out.println("Y: " + controller.getZombieScreenY());
                    
                    System.out.println("Bomb:");
                    System.out.println("X: " + controller.getBombListC().get(i).getX());
                    System.out.println("Y: " + controller.getBombListC().get(i).getY());
                    System.out.println("ID: " +  controller.getBombListC().get(i).getId());
                    */
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
