package creational;

public abstract class Factory {
	public final Product create(String Owner) {
		Product p = createProduct(Owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String Owner);
	protected abstract void registerProduct(Product p);
}
