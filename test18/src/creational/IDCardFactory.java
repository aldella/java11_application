package creational;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
	private ArrayList owners = new ArrayList<>();

	@Override
	protected Product createProduct(String Owner) {
		return new IDCard(Owner);
	}

	@Override
	protected void registerProduct(Product p) {
		
		
	}

}
