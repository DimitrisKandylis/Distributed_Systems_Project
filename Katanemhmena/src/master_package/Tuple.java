package master_package;
import master_package.DirectionsObject;

public class Tuple<String, DirectionsObject> {
	//The union of <key, value>
	public String key;
	public DirectionsObject value;
	public Tuple(String key, DirectionsObject value) {
		this.key = key;
		this.value = value;
	}
}
