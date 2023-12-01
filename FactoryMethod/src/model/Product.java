package model;

import java.math.BigDecimal;

public class Product {

	private String description;
	private BigDecimal price;
	private boolean dimensions;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isDimensions() {
		return dimensions;
	}

	public void setDimensions(boolean dimensions) {
		this.dimensions = dimensions;
	}

	@Override
	public String toString() {

		return "Produto: " + description + "\nPreço: " + price + "\nDimensão: " + dimensions;
	}

}
