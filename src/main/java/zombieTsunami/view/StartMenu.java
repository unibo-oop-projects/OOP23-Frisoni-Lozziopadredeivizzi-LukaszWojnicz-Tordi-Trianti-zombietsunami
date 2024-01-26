package main.java.zombieTsunami.view;

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

import main.java.zombieTsunami.view.mapView.api.MapData;
import main.java.zombieTsunami.view.mapView.impl.MapDataImpl;

public class StartMenu extends JPanel {

    private final JButton startButtonGame = new JButton("START PLAY");
    private final JButton rulesButton = new JButton("RULES");
    private final JLabel label = new JLabel("Zombie Tsunami");

    private final MapData data = new MapDataImpl();

    public StartMenu() {
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new DimensionUIResource(this.data.getScreenW(), this.data.getScreenH()));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void enableLabel() {
        this.label.setFont(new Font("Ariel", Font.BOLD, 50));
        this.add(Box.createVerticalStrut(120));
        this.label.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(label);
    }

    private void enableStartButton() {
        this.add(Box.createVerticalStrut(30));
        this.startButtonGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(startButtonGame);
    }

    private void enableRulesButton() {
        this.add(Box.createVerticalStrut(30));
        this.rulesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(rulesButton);
        addActionListenerToRuleButton();
    }

    private void addActionListenerToRuleButton(){
        this.rulesButton.addActionListener(e->{
            JOptionPane.showMessageDialog(null, "regole...", "Regole", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    public void enable(){
        enableLabel();
        enableStartButton();   
        enableRulesButton();
    }

    public JButton getStartButton(){
        return this.startButtonGame;
    }

}
