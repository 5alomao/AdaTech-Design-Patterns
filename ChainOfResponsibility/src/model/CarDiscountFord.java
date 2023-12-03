package model;

import java.math.BigDecimal;

public class CarDiscountFord extends CarDiscount {

	public CarDiscountFord(CarDiscount carDiscount) {
		super(carDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car objCar) {

		BigDecimal price = objCar.getPrice();

		if (Brand.FORD.equals(objCar.getBrand())) {
			return price.subtract(new BigDecimal(2000));
		}

		return carDiscount.applyDiscount(objCar);

	}

}
