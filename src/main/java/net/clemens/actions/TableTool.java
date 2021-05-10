package net.clemens.actions;

import net.clemens.gui.Gui;
import net.clemens.stats.ProgramState;

public final class TableTool {

    private static String displayname;
    private static ProgramState programState;


    public static void main(String[] args) {

        displayname = "[Table Tool v1 By Clemens]";
        programState = ProgramState.STARTING;

        Gui gui = new Gui();

        gui.createWindow();
    }

    public static String getDisplayname() {
        return displayname;
    }
    public static void setDisplayname(String displayname) {
        TableTool.displayname = displayname;
    }

    public static ProgramState getProgramState() {
        return programState;
    }

    public static void setProgramState(ProgramState programState) {
        TableTool.programState = programState;
    }
}
