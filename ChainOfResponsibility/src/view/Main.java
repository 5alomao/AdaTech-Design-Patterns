package view;

import java.math.BigDecimal;
import model.Brand;
import model.Car;
import model.CarSalesServiceChainOfResponsibility;

public class Main {

	public static void main(String[] args) {

		CarSalesServiceChainOfResponsibility service = new CarSalesServiceChainOfResponsibility();

		Car lancer = new Car("Lancer Evo VII", Brand.MITSUBISHI, new BigDecimal(200000));
		Car fusion = new Car("Fusion", Brand.FORD, new BigDecimal(90000));
		Car uno = new Car("Uno", Brand.FIAT, new BigDecimal(40000));

		System.out.println("Preço Lancer: " + lancer.getPrice());
		System.out.println("Preço Lancer Desconto: " + service.calculateSalePrice(lancer));

		System.out.println("Preço Fusion: " + fusion.getPrice());
		System.out.println("Preço Fusion Desconto: " + service.calculateSalePrice(fusion));

		System.out.println("Preço Uno: " + uno.getPrice());
		System.out.println("Preço Uno Desconto: " + service.calculateSalePrice(uno));

	}
}
