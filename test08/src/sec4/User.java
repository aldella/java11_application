package sec4;
//추상클래스
public abstract class User {
	protected String ip;
	protected int port;
	
	public abstract void connect();
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
