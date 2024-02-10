package zombietsunami.view;

import zombietsunami.view.api.VController;

public class VCollision {

    static boolean test = false;
    public static boolean checkCollision(VController controller) {
        for(int i = 0; i < controller.getBombListC().size(); i++){
            //System.out.println(controller.getBombListC().get(0).getX() + " " + controller.getBombListC().get(0).getY());
            if(controller.getBombListC().get(i) != null) {
                if(controller.getZombieMapY() == controller.getBombListC().get(i).getY() /*&&
                    controller.getZombieScreenX() == controller.getBombListC().get(i).getX()*/) {

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
        test = true;
        return false;
        
    }
    
}
