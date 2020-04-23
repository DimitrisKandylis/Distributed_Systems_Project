package master_package;
import master_package.Tuple;
import master_package.HashTextTest;

public class Worker_2 {
	public String IP_address;
	public String Port_number;
	HashTextTest hash2 = new HashTextTest("hash2");
	//public String responsible = HashTextTest.sha1(IP_address+Port_number);
	//Notify Master when mapping is done
	public boolean notify_master() {
		System.out.println("Worker_2 mapping is complete.");
		boolean x = true;
		return x;
	}
}
