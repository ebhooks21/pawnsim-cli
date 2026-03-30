package org.ericbhooks

/**
 * Filename: Game.kt
 * Author: Eric Hooks, 2026
 */

class Game(val gWin: GameWindow) {
	/**
	 * Method to start the game.
	 */
	fun start() {
		gWin.writeStringToScreen("Welcome to ${gWin.shopName}!", 1, 1)
	}
}