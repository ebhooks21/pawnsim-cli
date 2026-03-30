package org.ericbhooks

import kotlin.system.exitProcess


fun main() {
    //Start the game
    var gWin = GameWindow("Pawn Shop Simulator", 800, 600)

    if(gWin.createGameWindow()) {
        val game = Game(gWin)
    }

    else {
        println("Unable to initialize GameWindow.")
        exitProcess(1)
    }
}