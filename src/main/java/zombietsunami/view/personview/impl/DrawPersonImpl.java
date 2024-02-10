package zombietsunami.view.personview.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import zombietsunami.view.api.VController;
import zombietsunami.view.personview.api.DrawPerson;

/**
 * Implementation of the DrawPerson interface, responsible
 * for drawing the Person.
 */
public class DrawPersonImpl implements DrawPerson {
    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "person" + SEP;
    private static final String PERSON_00 = ROOT + "person_00.png";
    private static final String PERSON_01 = ROOT + "person_01.png";
    @Override
    public void drawPersonV(Graphics2D g2, VController controller) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drawPersonV'");
    }
    @Override
    public BufferedImage getPerson() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerson'");
    }
}
