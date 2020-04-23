package master_package;
import master_package.Tuple;
import master_package.HashTextTest;

public class Worker_1 {
	public String IP_address;
	public String Port_number;
	HashTextTest hash1 = new HashTextTest("hash1");
	//public String responsible = HashTextTest.sha1(IP_address+Port_number);
	//Notify Master when mapping is done
	public boolean notify_master() {
		System.out.println("Worker_1 mapping is complete.");
		boolean x = true;
		return x;
	}
}
