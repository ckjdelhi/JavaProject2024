package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class CollectionDemo3 {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1, 2, 5,10,20,3, 2, 60);
		list.forEach(obj->System.out.print(obj+" "));
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("------After sorting-------");
		list.forEach(obj->System.out.print(obj+" "));
		System.out.println("-------Java 8---------");
		list.stream()
			.sorted(Comparator.reverseOrder())
			.filter(p -> p % 2 == 0)
			.map(p -> p*p)
			.limit(1)
			.forEach(obj->System.out.println(obj));
		
		int sum = list.stream().reduce(0, (a, b)-> a * b);
		System.out.println(sum);
		
		
		Map<Integer, String> map=new Hashtable<>();
		map.put(100, "India");
		map.put(50, "US");
		map.put(200, "UK");
		map.put(500, "Nepal");
		map.put(10, "PK");
		map.put(150, "UK");
		System.out.println(map);
		map.entrySet()
			.stream()
			.filter(p -> p.getValue().startsWith("U"))
			.forEach(p->System.out.println(p.getKey()+"\t"+p.getValue()));
	}

}
