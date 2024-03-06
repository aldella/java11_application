package sec3;


public class Animal {
	protected String name;
	protected Boolean spine;
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSpine() {
		return spine;
	}

	public void setSpine(Boolean spine) {
		this.spine = spine;
	}
	
}
