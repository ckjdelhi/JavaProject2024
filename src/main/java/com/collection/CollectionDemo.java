package com.collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

/*
 * Collection(I)
 * 		List(I): duplicate data, ordered list
 * 			ArrayList(c): duplicate data, ordered list(insertion order), array ds, not thread safe(not sync)
 * 			Vector(c): duplicate data, ordered list(insertion order), array ds, thread safe(sync)
 * 			LinkedList(c): duplicate data, ordered list(insertion order), doubly linked list ds, not thread safe(not sync)
 * 		Queue(I): Stack, Queue
 * 			LinkedList(c)
 * 			PriorityQueue(c)
 * 		Set(I): Unique data, unordered
 * 			HashSet(c): Unique data, unordered, not thread safe(not sync)
 * 			TreeSet(c): Unique data, sorted (natural order), not thread safe(not sync)
 * 			LinkedHashSet(c): Unique data, ordered(insertion order), not thread safe(not sync)
 * Map(I): (key-value): unique key 
 * 		HashMap(c): unique key, unordered, not thread safe(not sync)
 * 		TreeMap(c): Unique key, sorted (natural order), not thread safe(not sync)
 * 		Hashtable(c): unique key, unordered, thread safe(sync)
 * 		LinkedHashMap(c): Unique key, ordered(insertion order), not thread safe(not sync)
 * 		
 */


public class CollectionDemo {

	public static void main(String[] args) {
		Vector<String> list=new Vector<>();
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("F");
		list.add("E");
		list.add("F");
		System.out.println(list);
		//while, do-while, for, for-each, .forEach, Iterator, ListInterator, Enumerator(vector)
		//int i =0;
//		while(i< list.size()) {
//			System.out.println(list.get(i));
//			i++;
//		}
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		for(String s: list) {
//			System.out.println(s);
//		}
		
		//list.forEach(obj -> System.out.println(obj));
		
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		ListIterator<String> itr=list.listIterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next() + " ");
//			list.add("Z"); //.ConcurrentModificationException ( fail-fast)
//		}
//		System.out.println();
//		while(itr.hasPrevious()) {
//			System.out.print(itr.previous() +" ");
//		}
//		Enumeration<String> enu= list.elements(); //fail-safe
//		while(enu.hasMoreElements()) {
//			System.out.println(enu.nextElement());
//			list.add("Z");
//		}
	
	}

}
