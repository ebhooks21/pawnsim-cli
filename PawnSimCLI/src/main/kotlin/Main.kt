package org.ericbhooks

import com.googlecode.lanterna.TerminalPosition
import com.googlecode.lanterna.TextCharacter
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import java.awt.Dimension

fun main() {
    TerminalScreen(DefaultTerminalFactory().createSwingTerminal()).use { screen ->
        screen.startScreen();
        screen.setCharacter(TerminalPosition(5, 5), TextCharacter('s'));
    };

    DefaultTerminalFactory().createSwingTerminal().use { terminal ->
        terminal.title = "Test";
        terminal.isVisible = true;
        terminal.size = Dimension(800, 600);

        (TerminalScreen(terminal)).use { screen ->
            screen.startScreen();
            while(true){

            }
        }
    }
}