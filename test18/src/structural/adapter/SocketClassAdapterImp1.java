package structural.adapter;

public class SocketClassAdapterImp1 extends Socket implements SocketAdapter{

	@Override
	public Volt get110Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,12);
	}

	@Override
	public Volt get9Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,9);
	}

	@Override
	public Volt get6Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,6);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getAmount()/i);
	}
	
}
