package br.com.francis.franmework.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Utility class used for reading console input.
 * 
 * @author Francis
 *
 */
public final class Console {

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	private static BufferedReader reader;

	private Console() {

	}

	/**
	 * Shows a message on console then waits for the user input.
	 * 
	 * @param message
	 *            The message to be displayed
	 * @return The value input by the user, or null if the input is invalid.
	 */
	public static String readString(String message) {
		if (message == null) {
			message = "";
		} else {
			message += " ";
		}
		System.out.print(message);
		try {
			return reader.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * Shows a message on console then waits for the user input.
	 * 
	 * @param message
	 *            The message to be displayed.
	 * @return The value input by the user, parsed to Integer, or null if the
	 *         input is invalid.
	 */
	public static Integer readInt(String message) {
		try {
			return Integer.parseInt(readString(message));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	/**
	 * Shows a message on console then waits for the user input.
	 * 
	 * @param message
	 *            The message to be displayed.
	 * @return The value input by the user, parsed to Double, or null if the
	 *         input is invalid.
	 */
	public static Double readDouble(String message) {
		try {
			return Double.parseDouble(readString(message));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	/**
	 * Shows a message on console then waits for the user input.
	 * 
	 * @param message
	 *            The message to be displayed.
	 * @return The value input by the user, parsed to Boolean, or null if the
	 *         input is invalid.
	 */
	public static Boolean readBoolean(String message) {
		return "true".equals(readString(message));
	}
}
