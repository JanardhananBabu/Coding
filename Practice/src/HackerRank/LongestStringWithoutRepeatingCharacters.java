package HackerRank;

import java.util.HashSet;

public class LongestStringWithoutRepeatingCharacters {
	
	public static void main(String... args){
		String input = "geeksforgeeks";
		HashSet<Character> set;
		int max=0;
		for(int i=0;i<input.length()-1;i++){
			set = new HashSet<>();
			set.add(input.charAt(i));
			for(int j=i+1;j<input.length();j++){
				if(set.contains(input.charAt(j))){
					if(set.size()>max){
						max=set.size();
					}
					break;
				}
				else{
					set.add(input.charAt(j));
				}
				
			}
		}
		
		System.out.println(max);
	}

}
