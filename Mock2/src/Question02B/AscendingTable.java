package Question02B;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable <K,V> extends TreeMap<K, V> {
	
	public static <K, V> void display(Map<K, V> list) {
		
		for(Map.Entry<K, V> value : list.entrySet()) {
			
			System.out.println(value.getKey()+", "+value.getValue());
		}
	}

	public void add(K a, V b) {
		super.put(a, b);
	}	
}
