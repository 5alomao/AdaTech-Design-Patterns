package model;

import java.math.BigDecimal;

public abstract class CarDiscount {

	protected CarDiscount carDiscount;

	public CarDiscount(CarDiscount carDiscount) {
		this.carDiscount = carDiscount;
	}

	public abstract BigDecimal applyDiscount(Car objCar);
}
