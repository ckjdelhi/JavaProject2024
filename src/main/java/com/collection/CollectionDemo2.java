package com.collection;

import java.util.*;
import java.util.Map.Entry;

public class CollectionDemo2 {

	public static void main(String[] args) {
		//Map<Integer, String> map=new HashMap<>();
		//Map<Integer, String> map=new LinkedHashMap<>();
		//Map<Integer, String> map=new TreeMap<>();
		Map<Integer, String> map=new Hashtable<>();
		map.put(100, "India");
		map.put(50, "US");
		map.put(200, "UK");
		map.put(500, "Nepal");
		map.put(10, "PK");
		map.put(50, "UK");
		System.out.println(map);
		System.out.println(map.get(1000));
		System.out.println(map.getOrDefault(100, "Key is not available"));
		
		System.out.println(map.keySet());//[10, 50, 500, 200, 100]
		System.out.println(map.values());//[PK, UK, Nepal, UK, India]
		System.out.println(map.entrySet());
		
		for(Integer key: map.keySet()) {
			System.out.println(key +"\t"+map.get(key));
		}
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() +"\t"+entry.getValue());
		}
		
	}

}
