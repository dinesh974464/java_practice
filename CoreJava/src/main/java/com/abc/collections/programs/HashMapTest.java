package com.abc.collections.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Object put(Object key,Object value)
//void putAll(Map m)
//Object get(Object key) // returns value with specified key.
//Object remove(Object key)// removes the entry associated with specified key.
//boolean containsKey(Object key)// 
//boolean containsValue(Object value)
//boolean isEmpty()
//int size();
//void clear();
//Set KeySet // collection views of map
//Collection values() // collection views of map
// Set entrySet()// collection views of map
//
public class HashMapTest {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi", 1000));
		Set s=m.keySet();
		Collection c =m.values();
		Set s1=m.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+" ...."+m1.getValue());
		if(m1.getKey().equals("nagarjuna")) {
			m1.setValue(10000);
		}
		}
		System.out.println(m);
	
	}

}
