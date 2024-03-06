package sec2;


public class Animal {
	String name;
	Boolean spine;
	
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
