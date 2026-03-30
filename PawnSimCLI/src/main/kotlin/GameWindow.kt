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
    var screen: TerminalScreen? = null
    var terminal: SwingTerminalFrame? = null

    /**
     * Method to create the game window.
     */
    fun createGameWindow() {
        terminal  = DefaultTerminalFactory().createSwingTerminal()

        if(terminal == null) {
            println("Error while creating terminal.")
            exitProcess(1);
        }

        terminal!!.title = shopName
        terminal!!.isVisible = true
        terminal!!.size = Dimension(winWidth, winHeight)

        screen = (TerminalScreen(terminal))

        if(screen == null) {
            println("Error while creating screen.")
            exitProcess(1)
        }

        screen?.startScreen();
        screen?.setCharacter(TerminalPosition(5, 5), TextCharacter('s'))

        while(true){

        }
    }
}