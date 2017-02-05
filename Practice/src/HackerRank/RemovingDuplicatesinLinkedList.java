package HackerRank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemovingDuplicatesinLinkedList {

	public static void main(String...args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(6);
		
		HashSet<Integer> set = new HashSet<>();
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			int curr = (int)iter.next();
			if(set.contains(curr)){
				iter.remove();
			}
			else{
				set.add(curr);
			}
		}
		iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
	}
}
