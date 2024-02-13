package zombietsunami.view.personview.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.List;

import javax.imageio.ImageIO;

import zombietsunami.Pair;
import zombietsunami.view.api.VController;
import zombietsunami.view.personview.api.DrawPerson;

/**
 * Implementation of the DrawPerson interface, responsible
 * for drawing the Person.
 */
public class DrawPersonImpl implements DrawPerson {
    private boolean change = true;
    private int changeCounter;
    private static final int FRAMESCHANGE = 15;
    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "person" + SEP;
    private static final String PERSON_00 = ROOT + "Person_00.png";
    private static final String PERSON_01 = ROOT + "Person_01.png";

    @Override
    public void drawPersonV(Graphics2D g2, List<Integer> personIndexList, List<Pair<Integer, Integer>> screenTilePos,
            int titleSize, VController controller) {
                for (int i = 0; i < personIndexList.size(); i++) {
                    if (personIndexList.get(i) == 1 && screenTilePos.get(i) != null) {
                        controller.getPersonFromMapC(personIndexList, screenTilePos, controller.getStrenght());
                        drawPerson(getPerson(), g2, personIndexList, screenTilePos, titleSize, i);
                    }
                }
    }

    private void drawPerson(BufferedImage image, Graphics2D g2, List<Integer> personIndexList, List<Pair<Integer, Integer>> screenTilePos, int titleSize, int i) {
        g2.drawImage(image, screenTilePos.get(i).getX(), screenTilePos.get(i).getY(), titleSize, titleSize, null);
    }

    private int getChange() {
        return changeCounter;
    }

    private int increaseChange() {
        return changeCounter++;
    }

    /**
     * Gets the image of the Person
     */
    @Override
    public BufferedImage getPerson() {
        BufferedImage image = null;
        try {
            if (change) {
                image = ImageIO.read(getClass().getResource(PERSON_00));
            } else {
                image = ImageIO.read(getClass().getResource(PERSON_01));
            }
            increaseChange();
            if (getChange() > FRAMESCHANGE) {
                change = !change;
                changeCounter = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    @Override
    public void updatePerson(final VController controller) {
        controller.updatePerson();
    }
}
