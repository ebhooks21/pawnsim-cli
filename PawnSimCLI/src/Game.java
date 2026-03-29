/**
 * Filename: Game.java
 * Author: Eric Hooks, 2026
 * Purpose: Main class for the Game.
 */

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
	//Variable for the game window
	private Window win;

	/**
	 * Main constructor for the Game class.
	 */
	public Game() throws IOException {
		//Start the game
		win = new Window(800, 600);

		(win.getTerminal()).enterPrivateMode();
		(win.getTerminal()).clearScreen();
		(win.getTerminal()).setBackgroundColor(TextColor.ANSI.GREEN);
		(win.getTerminal()).flush();
	}

	/**
	 * Method to get the window object.
	 */
	public Window getWindow() {
		return win;
	}
}
