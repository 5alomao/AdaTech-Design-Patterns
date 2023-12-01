package view;

import model.Product;
import model.ProductFactory;
import model.ProductType;

public class Main {

	public static void main(String[] args) {

		Product digProduct = ProductFactory.createProduct(ProductType.DIGITAL);
		Product phyProduct = ProductFactory.createProduct(ProductType.PHYSICAL);

		System.out.println(digProduct);
		System.out.println();
		System.out.println(phyProduct);

	}

}
