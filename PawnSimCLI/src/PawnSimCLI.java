import java.io.IOException;

/**
 * Filename: PawnSimCLI.java
 * Author: Eric Hooks, 2026
 * Purpose: Main class for the PawnSimCLI.
 */
public class PawnSimCLI {
	public static void main(String[] args) {
		try {
			Game g = new Game();
		}

		catch(IOException ioe) {
			System.out.println(ioe.getStackTrace());
			System.exit(1);
		}
	}
}
