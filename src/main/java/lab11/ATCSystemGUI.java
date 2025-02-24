package src.main.java.lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ATCSystemGUI extends JFrame {
    private Aircraft aircraft;

    public ATCSystemGUI() {
        aircraft = new Aircraft();

        setTitle("ATC System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Buttons for user interaction
        JButton takeOffButton = new JButton("Take Off");
        takeOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    aircraft.handleTakeOff();
                    int targetAltitude = Integer.parseInt(JOptionPane.showInputDialog("Enter cruising altitude in meters (1000-3000):"));
                    aircraft.ascendToAltitude(targetAltitude / 1000); // Entered value should be in meters
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton landButton = new JButton("Land");
        landButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    aircraft.handleLanding();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add components to the frame
        add(takeOffButton);
        add(landButton);

        // Display current state
        JLabel stateLabel = new JLabel("Current state: " + aircraft.getState().name());
        add(stateLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ATCSystemGUI();
    }
}