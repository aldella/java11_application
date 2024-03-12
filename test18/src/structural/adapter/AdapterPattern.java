package structural.adapter;

public class AdapterPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

	}
	public static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImp1();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12= getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
	}
	public static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImp1();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12= getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
	}
	
	public static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch(i) {
		case 6:
			return sockAdapter.get6Volt();
		case 9:
			return sockAdapter.get9Volt();
		case 12:
			return sockAdapter.get12Volt();
		default: return sockAdapter.get110Volt();
		}
	}
}
