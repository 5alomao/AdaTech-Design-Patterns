package view;

import model.Button;
import model.ButtonRegistry;

public class Main {

	public static void main(String[] args) {

		Button redButton = ButtonRegistry.getButton("red");
		Button blueButton = ButtonRegistry.getButton("blue");

		System.out.println(redButton);
		System.out.println(blueButton);
	}
}
