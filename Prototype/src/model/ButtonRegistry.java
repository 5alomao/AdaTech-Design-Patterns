package model;

import java.util.HashMap;
import java.util.Map;

public class ButtonRegistry {

	public static Map<String, Button> REGISTRY = new HashMap<>();

	static {
		Button redButton = new Button();
		redButton.setColor("Red");
		redButton.setborderType(BorderType.DASHED);
		redButton.setHeight(35);
		redButton.setWidth(125);

		Button blueButton = new Button();
		blueButton.setColor("Blue");
		blueButton.setborderType(BorderType.SOLID);
		blueButton.setHeight(30);
		blueButton.setWidth(110);

		REGISTRY.put("red", redButton);
		REGISTRY.put("blue", blueButton);
	}

	public static Button getButton(String key) {
		return ButtonFactory.getInstance(REGISTRY.get(key));
	}
}
