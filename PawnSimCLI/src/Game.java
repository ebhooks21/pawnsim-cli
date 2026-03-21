/**
 * Filename: Game.java
 * Author: Eric Hooks, 2026
 * Purpose: Main class for the Game.
 */

import java.io.IOException;

import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

public class Game {
	/**
	 * Main constructor for the Game class.
	 */
	public Game() {
		try {
			Terminal terminal = new DefaultTerminalFactory().createSwingTerminal();

			SwingTerminalFrame frame = (SwingTerminalFrame) terminal;
			frame.setTitle("Pawn Shop Simulator");
			frame.setSize(800, 600);
			frame.setVisible(true);

			while (true) { 
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
