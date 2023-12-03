package model;

import java.math.BigDecimal;

public class CarDiscountFiat extends CarDiscount {

	public CarDiscountFiat(CarDiscount carDiscount) {
		super(carDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car objCar) {

		BigDecimal price = objCar.getPrice();

		if (Brand.FIAT.equals(objCar.getBrand())) {
			return price.subtract(new BigDecimal(1000));
		}

		return carDiscount.applyDiscount(objCar);

	}
}
