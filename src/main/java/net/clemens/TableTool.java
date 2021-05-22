package net.clemens;

import javax.swing.*;
import java.awt.*;

public final class TableTool {

    // declare and initialize width and height
    static int width = 1024, height = 768;

    /**
     * The main class i guess. ^^
     * @param args contains the supplied command-line arguments as an array of String objects.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            // declare and initialize new JFrame
            JFrame jFrame = new JFrame("I'm your JFrame");

            // set default close operation to 3
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            // set width and height of the JFrame
            jFrame.setSize(width, height);
            jFrame.setResizable(false);

            // set location relative to null
            jFrame.setLocationRelativeTo(null);

            // paint the entire JFrame to pastel pink
            jFrame.getContentPane().setBackground(new Color(194, 121, 220));

            // set visible
            jFrame.setVisible(true);
        });
    }
}

