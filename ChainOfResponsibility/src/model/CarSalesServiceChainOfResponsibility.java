package model;

import java.math.BigDecimal;

public class CarSalesServiceChainOfResponsibility {

	public BigDecimal calculateSalePrice(Car objCar) {

		CarDiscount discount = new CarDiscountHighPrice(
				new CarDiscountFord(new CarDiscountFiat(new CarNoDiscount(null))));

		return discount.applyDiscount(objCar);

	}
}
