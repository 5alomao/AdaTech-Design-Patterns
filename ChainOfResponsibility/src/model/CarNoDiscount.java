package model;

import java.math.BigDecimal;

public class CarNoDiscount extends CarDiscount {

	public CarNoDiscount(CarDiscount carDiscount) {
		super(carDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car objCar) {
		return BigDecimal.ZERO;
	}
}
