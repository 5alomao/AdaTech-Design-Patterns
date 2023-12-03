package model;

import java.math.BigDecimal;

public class CarDiscountHighPrice extends CarDiscount {

	public CarDiscountHighPrice(CarDiscount carDiscount) {
		super(carDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car objCar) {

		BigDecimal price = objCar.getPrice();

		if (price.compareTo(new BigDecimal(100000)) > 0) {
			return price.subtract(new BigDecimal(10000));
		}

		return carDiscount.applyDiscount(objCar);

	}
}
