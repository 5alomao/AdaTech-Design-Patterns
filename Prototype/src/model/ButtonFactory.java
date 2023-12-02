package model;

public class ButtonFactory {

	public static Button getInstance(Button buttonPrototype) {

		Button buttonClone = new Button();
		buttonClone.setColor(buttonPrototype.getColor());
		buttonClone.setHeight(buttonPrototype.getHeight());
		buttonClone.setWidth(buttonPrototype.getWidth());
		buttonClone.setborderType(buttonPrototype.getborderType());

		return buttonClone;

	}
}
