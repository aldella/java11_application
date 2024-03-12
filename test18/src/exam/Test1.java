package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class IPInfo {
	private String ip;
	private String user;
	public IPInfo(String ip, String user) {
		super();
		this.ip = ip;
		this.user = user;
	}
	public IPInfo(String ip) {
		super();
		this.ip = ip;
	}
	public IPInfo() {
	}
	@Override
	public String toString() {
		return "IPInfo [ip=" + ip + ", user=" + user + "]";
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<IPInfo> ipInfoList = new ArrayList<>();
		ipInfoList.add(new IPInfo("121212"));
		System.out.print("ipÀÔ·Â");
		String ip = sc.next();
		for(int i=0; i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
		}
	}

}
