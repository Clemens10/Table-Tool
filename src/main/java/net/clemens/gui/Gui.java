package net.clemens.gui;

import net.clemens.actions.TableTool;
import net.clemens.stats.ProgramState;

import javax.swing.*;
import java.awt.*;

public class Gui {

    private JFrame jFrame;
    private JButton jButton = new JButton();
    public final static int widthSize = 1024, heightSize = 768;


    public void createWindow() {

        jFrame = new JFrame(TableTool.getDisplayname());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jFrame.setSize(widthSize, heightSize);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

        jFrame.setBackground(Color.BLACK);

    }


}
