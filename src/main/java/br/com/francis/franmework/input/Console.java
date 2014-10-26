package br.com.francis.franmework.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Console {

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	private static BufferedReader reader;

	private Console() {

	}

	public static String readString(String text) {
		if (text == null) {
			text = "";
		} else {
			text += " ";
		}
		System.out.print(text);
		try {
			return reader.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static Integer readInt(String text) {
		try {
			return Integer.parseInt(readString(text));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static Double readDouble(String text) {
		try {
			return Double.parseDouble(readString(text));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static Boolean readBoolean(String text) {
		return "true".equals(readString(text));
	}
}
