package net.clemens.gui;

import net.clemens.actions.TableTool;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics graphics) {

        graphics.setColor(new Color(255, 153, 0));
        graphics.fillRect(0, 0, Gui.widthSize, Gui.heightSize);
        repaint();

    }

}
