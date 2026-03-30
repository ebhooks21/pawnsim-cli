package org.ericbhooks

/**
 * Filename: GameWindow.kt
 * Author: Eric Hooks, 2026
 */

import com.googlecode.lanterna.TerminalPosition
import com.googlecode.lanterna.TextCharacter
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.swing.SwingTerminal
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame
import java.awt.Dimension
import kotlin.system.exitProcess

class GameWindow(var shopName: String, var winWidth: Int, var winHeight: Int) {
    //Variables
    lateinit var screen: TerminalScreen
    lateinit var terminal: SwingTerminalFrame

    /**
     * Method to create the game window.
     */
    fun createGameWindow(): Boolean {
        //Create a new Swing Terminal
        terminal  = DefaultTerminalFactory().createSwingTerminal()

        //Set the terminal variables
        terminal.title = shopName
        terminal.isVisible = true
        terminal.size = Dimension(winWidth, winHeight)

        //Get a copy of the Terminal's screen
        screen = (TerminalScreen(terminal))

        //Clear the screen and start tracking
        screen.startScreen();

        return true
    }

    /**
     * Method to write a string to the screen.
     */
    fun writeStringToScreen(str: String, xPos: Int, yPos: Int) {
        screen.newTextGraphics().putString(xPos, yPos, str)
        screen.refresh()
    }
}