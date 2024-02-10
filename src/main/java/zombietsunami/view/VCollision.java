package zombietsunami.view;

import zombietsunami.view.api.VController;

public class VCollision {
    

    public static boolean checkCollision(VController controller) {
        for(int i = 0; i < controller.getBombListC().size(); i++)  {
            if(controller.getBombListC().get(i) != null) {
                if(controller.getBombListC().get(i).getX() > 80 &&
                    controller.getBombListC().get(i).getX() < 100 &&
                    controller.getZombieScreenY() > controller.getBombListC().get(i).getY() &&
                    controller.getZombieScreenY() < controller.getBombListC().get(i).getY() + controller.titleSizeC()) {
                    
                    System.out.println("Zombie:");
                    System.out.println("X: " + controller.getZombieMapX());
                    System.out.println("Y: " + controller.getZombieMapY());
                    
                    System.out.println("Bomb:");
                    System.out.println("X: " + controller.getBombListC().get(i).getX());
                    System.out.println("Y: " + controller.getBombListC().get(i).getY());
                    System.out.println("ID: " +  controller.getBombListC().get(i).getId());
                    
                    return true;
                }
            }
        }
        for(int i = 0; i < controller.getBreakableListC().size(); i++)  {
            if(controller.getBreakableListC().get(i) != null) {
                if(controller.getBreakableListC().get(i).getX() > 80 &&
                    controller.getBreakableListC().get(i).getX() < 100 &&
                    controller.getZombieScreenY() > controller.getBreakableListC().get(i).getY() &&
                    controller.getZombieScreenY() < controller.getBreakableListC().get(i).getY() + controller.titleSizeC()) { //condizione NON FUNZIONANTE
                        
                        System.out.println("Zombie:");
                        System.out.println("X: " + controller.getZombieScreenX());
                        System.out.println("Y: " + controller.getZombieScreenY());
                        
                        System.out.println("Breakable:");
                        System.out.println("X: " + controller.getBreakableListC().get(i).getX());
                        System.out.println("Y: " + controller.getBreakableListC().get(i).getY());
                        System.out.println("ID: " +  controller.getBreakableListC().get(i).getId());
                        
                        
                        return true;
                    }
                }
            }
        return false;
        
    }
    
}
