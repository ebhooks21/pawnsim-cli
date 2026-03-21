/**
 * Filename: Window.java
 * Author: Eric Hooks, 2026
 * Purpose: To hold the window for the game.
 */

import java.io.IOException;

import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

public class Window {
    //Variable for the terminal
    private Terminal win;

    //Variable for the window frame
    private SwingTerminalFrame frame;

    /**
     * Main constructor for the Window class.
     */
    public Window(int width, int height) {
        try {
            win = new DefaultTerminalFactory().createSwingTerminal();

            frame = (SwingTerminalFrame) win;
            frame.setTitle("Pawn Shop Simulator");
            frame.setVisible(true);
            frame.setSize(width, height);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            System.exit(1);
        }
    }
}
