package master_package;
import java.util.*;
import master_package.DirectionsObject;
import master_package.Worker_1;
import master_package.Worker_2;
import master_package.Worker_3;
import master_package.Reducer;
import master_package.HashTextTest;

public class Master {
	//Memory that holds the last 100 DirectionsObjects that were searched
	private ArrayList<DirectionsObject> Cache = new ArrayList<DirectionsObject>(100);
	//Search Cache memory for DirectionsObject
	public int search_cache(DirectionsObject x) {
		//Check if cache memory is empty
		if(Cache.isEmpty()) {
			System.out.println("Cache is empty!");
			return 0;
		}
		int mege8os_array = Cache.size();
		boolean item_found = false;
		//Check cache for object and return position if found
		for(int i = 0; i<mege8os_array; i++) {
			if(x==Cache.get(i)) {
				System.out.println("The object was found in Cache.");
				item_found = true;
				return i;
			}
		}
		//Return 0 if object not found
		if(item_found==false) {
			System.out.println("The object was not found in Cache.");
			return 0;
		}
		return 0;
	}
	//Import a new Object in cache and check if it is full
	public void import_cache(DirectionsObject x) {
		//Check if cache is full
		if(Cache.size()==100) {
			System.out.println("Cache memory is full!");
			Cache.remove(0);
			for(int i=1; i<Cache.size()-1; i++) {
				Cache.set(i, Cache.get(i+1));
			}
			Cache.add(x);
		}
		else {
			Cache.add(x);
		}
	}
	
}
