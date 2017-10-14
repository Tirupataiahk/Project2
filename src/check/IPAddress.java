package check;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {
		
		try {
			System.out.println(InetAddress.getLocalHost());
		} catch (Exception e) {
			System.out.println("Exception i: "+e.getMessage());
		}

	}

}
