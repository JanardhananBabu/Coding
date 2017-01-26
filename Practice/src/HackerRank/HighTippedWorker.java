package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class HighTippedWorker {
	static class Worker implements Comparable<Worker>{
		String name;
		int tip;
		Worker(String name, int tip)
		{
			this.name=name;
			this.tip=tip;
		}
		@Override
		public int compareTo(Worker other) {
		    if(this.tip==other.tip){
		    	return this.name.compareTo(other.name);
		    }
		    else{
		    	return  Integer.compare(other.tip, this.tip);
		    }
		}

	}

	public static void findHighTippedEmployees(){
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		Map<Integer,TreeSet<String>> map2 = new TreeMap<Integer,TreeSet<String>>(Collections.reverseOrder());
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String current = scan.nextLine();
			if(current.equals("stop"))
				break;
			String[] result = current.split(" ");
			//System.out.println(current);
			int val = Integer.parseInt(result[1].substring(1));
			if (map1.containsKey(result[0])){
				int currVal = map1.get(result[0]);
				map1.put(result[0],currVal+val);
			}
			else
				map1.put(result[0], val);
		}
		
		Iterator it = map1.entrySet().iterator();
		
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        int val = (int)pair.getValue();
	        String name = (String)pair.getKey();
	        if (map2.containsKey(val))
	        	map2.get(val).add(name);
	        else{
	        	TreeSet<String> set = new TreeSet<String>();
	        	set.add(name);
	        	map2.put(val, set);
	        }
	    }
	    
	    it = map2.entrySet().iterator();
	    
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        int key = (int)pair.getKey();
	        TreeSet<String> set = (TreeSet<String>)pair.getValue();
	        for (String eachName : set )
	        	System.out.println(eachName + " "+ "$"+key);
	    }
	}
	
	public static void myHighTippedEmployees(){
		Scanner scan = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();
		ArrayList<Worker> list = new ArrayList<Worker>();
		while(scan.hasNextLine()){
			String key = scan.next();
			if(key.equals("stop"))
				break;
			String value = scan.next();
			if(!map.containsKey(key))
				map.put(key, Integer.parseInt(value.substring(1)));
			else
				map.put(key, map.get(key)+Integer.parseInt(value.substring(1)));
		}
		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
			list.add(new Worker(entry.getKey(),entry.getValue()));
		}
		Collections.sort(list);
		/*Collections.sort(list,new Comparator<Worker>() {
		    @Override
		    public int compare(Worker o1, Worker o2) {
		    	if(o1.tip==o2.tip){
			    	return o1.name.compareTo(o2.name);
			    }
			    else{
			    	return Integer.compare(o2.tip, o1.tip);
			    }
		    }
		});*/
		for(Worker worker:list){
			System.out.println(worker.name+" $"+worker.tip);
		}
	}
	
	public static void main(String...arg){
		System.out.println("joe".compareTo("andrew"));
		System.out.println("andrew".compareTo("joe"));
		System.out.println("andrew".compareTo("dustin"));
		System.out.println("dustin".compareTo("andrew"));
		System.out.println("dustin".compareTo("joe"));
		System.out.println("joe".compareTo("dustin"));
		System.out.println(Integer.compare(1, 2));
		System.out.println(Integer.compare(2, 1));
		System.out.println(Integer.compare(3, 2));
		System.out.println(Integer.compare(2, 3));
	}
}
