package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FriendlyText {
	
	public static String sortedText(String text){
		char[] arr = text.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static String[] friendlyWords(String[] input){
		Arrays.sort(input);
		ArrayList<String> list = new ArrayList<String>(); 
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		for(int i=0;i<input.length;i++){
			String sTxt = sortedText(input[i]);
			if(map.containsKey(sTxt))
				map.put(sTxt,map.get(sTxt)+" "+input[i]);
			else
				map.put(sTxt,input[i]);
		}
		
		Iterator<Entry<String,String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			String txt = iterator.next().getValue();
			if(txt.contains(" ")){
				list.add(txt);
			}
		}
		return list.toArray(new String[list.size()]);
	}

	public static void main(String args[]){
		String[] input={"CTA","CAT","ATC","DAM","TEACHER","CHEATER","LIVE","EVIL"};
		
		String[] put=new FriendlyText().friendlyWords(input);
		for(String a:put)
			System.out.println(a);
	}
}
