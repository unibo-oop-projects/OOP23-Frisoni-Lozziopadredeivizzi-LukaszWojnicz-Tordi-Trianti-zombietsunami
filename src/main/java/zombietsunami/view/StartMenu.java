package zombietsunami.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

/**
 * This class is the start menu panel for the game.
 */
public final class StartMenu extends JPanel {

    private static final long serialVersionUID = 123456789L;

    private static final int FONT_SIZE = 50;
    private static final int LABEL_HEIGHT = 120;
    private static final int BUTTONS_HEIGHT = 30;

    private final JButton startButtonGame = new JButton("START PLAY");
    private final JButton rulesButton = new JButton("RULES");
    private final JLabel label = new JLabel("Zombie Tsunami");

    /**
     * Sets the panel dimensions.
     * 
     * @param screenW the screen width
     * @param screenH the screen hight
     */
    public StartMenu(final int screenW, final int screenH) {
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new DimensionUIResource(screenW, screenH));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    /**
     * This method enable the start panel label.
     */
    private void enableLabel() {
        this.label.setFont(new Font("Ariel", Font.BOLD, FONT_SIZE));
        this.add(Box.createVerticalStrut(LABEL_HEIGHT));
        this.label.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(label);
    }

    /**
     * This method enable the start panlel 'start game' button.
     */
    private void enableStartButton() {
        this.add(Box.createVerticalStrut(BUTTONS_HEIGHT));
        this.startButtonGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(startButtonGame);
    }

    /**
     * This method enable the start panel 'rules' button.
     */
    private void enableRulesButton() {
        this.add(Box.createVerticalStrut(BUTTONS_HEIGHT));
        this.rulesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(rulesButton);
        addActionListenerToRuleButton();
    }

    /**
     * This method adds an action listener to the 'rules' button.
     */
    private void addActionListenerToRuleButton() {
        this.rulesButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "regole...", "Regole", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    /**
     * This method enable all the start panel elements.
     */
    public void enableStartPanel() {
        enableLabel();
        enableStartButton();
        enableRulesButton();
    }

    /**
     * @return the 'start game' button
     */
    public JButton getStartButton() {
        return this.startButtonGame;
    }

}
