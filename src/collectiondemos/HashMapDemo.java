package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap m=new HashMap();
		HashMap <Integer,String> m=new HashMap<Integer,String>();
	
		m.put(101,"John");
		m.put(102,"David");
		m.put(103,"Scott");
		m.put(104,"Mary");
		m.put(105,"Tye");
		m.put(103,"X");
		m.put(106,"David");
		
		System.out.println(m); //{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
		
		System.out.println(m.get(105));  //Tye
		
		m.remove(106);  // remove pair from hashmap
		System.out.println(m); 
		
		System.out.println(m.containsKey(101)); // true
		System.out.println(m.containsKey(106)); // false
		
		System.out.println(m.containsValue("Mary")); // True
		System.out.println(m.containsValue("Y"));  //false
		
		System.out.println(m.isEmpty()); //false
		
		System.out.println(m.keySet());  // returns all the keys as Set [101, 102, 103, 104, 105]
		
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
				
		//System.out.println(m.values()); // returns all the values as Collection //[John, David, X, Mary, Tye]
		
		for(Object i:m.values())
		{
			System.out.println(i);
		}
			
		/*for(Object i:m.keySet()) 
		{
			System.out.println(i+"     "+m.get(i));
		}*/
		
		// Entry methods
		//*****************
		for(Entry<Integer, String> entry:m.entrySet()) // 101  x
		{
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		//iterator()
		
		Set<Entry<Integer, String>> s=m.entrySet();
		
		Iterator<Entry<Integer, String>> itr=s.iterator();
	
			while(itr.hasNext())
			{
			Entry<Integer, String> entry=(Entry<Integer, String>) itr.next();   // 101 x  entry
			System.out.println(entry.getKey()+"      "+entry.getValue());
			
			}
		
	}
	
	

}
