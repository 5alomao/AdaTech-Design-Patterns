package model;

public class Button {

	protected String color;
	protected int height;
	protected int width;
	protected BorderType borderType;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public BorderType getborderType() {
		return borderType;
	}

	public void setborderType(BorderType borderType) {
		this.borderType = borderType;
	}

	@Override
	public String toString() {
		return "Cor: " + color + "\nAltura: " + height + "\nLargura: " + width + "\nBorda: " + borderType + "\n";
	}

}
