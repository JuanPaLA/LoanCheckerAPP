package DiplomaturaJavaUTN.LoanChecker;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpDetect {
	
	static String pcIp;
	
 public static String ipDetecter() {
	 try {
		 pcIp=InetAddress.getLocalHost().getHostAddress();
	 } catch (UnknownHostException e) {
			e.printStackTrace();
		}
	 return "IP DE PC " +  pcIp;
 }
	
	public static void main(String[] args) {
		
		ipDetecter();
		System.out.println(pcIp);
	}

}
