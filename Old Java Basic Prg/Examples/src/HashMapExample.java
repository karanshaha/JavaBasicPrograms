import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HashMapExample {
	
	public static void main(String s[]){
		HashMap<String, String> hashMap = new HashMap<String,String>();
		
		//hashMap.put(null, "Karan");
		hashMap.put("ku", "Kunal");
		hashMap.put("ku1", null);
		List<String> l = new ArrayList<String>();
		
		l.add("aa");
		Collections.unmodifiableCollection( l);
		l.remove(0);
		
	
		hashMap.put(null, null);
		
		Collections.synchronizedMap(hashMap);
		
		Set<String> set = hashMap.keySet();
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			String value = hashMap.get(key);
			System.out.println(key+" :::: "+value);
			//it.remove();
		}
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(1066, "A4");
		hashtable.put(1055, "A2");
		hashtable.put(1033, "A1");
		
		Set<Integer> set1 = hashtable.keySet();
		Iterator<Integer> it1 = set1.iterator();
		while (it1.hasNext()) {
			
			Integer key = it1.next();
			String value = hashtable.get(key);
			System.out.println(key+" :::: "+value);
			it1.remove();
		}
		
		System.out.println(hashtable.size());
	}

}
