package model;

public class ProductFactory {

	public static Product createProduct(ProductType type) {

		switch (type) {
		case PHYSICAL:
			PhysicalProduct phyProduct = new PhysicalProduct();
			phyProduct.setDimensions(false);
			return phyProduct;

		case DIGITAL:
			DigitalProduct digProduct = new DigitalProduct();
			digProduct.setDimensions(true);
			return digProduct;

		default:
			throw new IllegalArgumentException("Tipo de Produto não disponível: " + type);
		}

	}
}
