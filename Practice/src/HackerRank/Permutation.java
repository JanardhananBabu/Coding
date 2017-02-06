package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	
	public List<List<Integer>> permutationWithOutDuplicates(int[] input){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(input);//not required when there is duplicate element
		permutationWithOutDuplicatesUtil(list,new ArrayList<Integer>(),input);
		return list;
	}

	public void permutationWithOutDuplicatesUtil(List<List<Integer>> list, List<Integer> currList, int[] input){
		if(currList.size()==input.length){
			list.add(new ArrayList<Integer>(currList));
		}
		else{
			for(int i=0;i<input.length;i++){
				if(currList.contains(input[i]))continue;//to add new elements 
				currList.add(input[i]);
				permutationWithOutDuplicatesUtil(list,currList,input);
				currList.remove(currList.size()-1);
			}
		}
	}
	
	public void permutationWithDuplicatesUtil(List<List<Integer>> list, List<Integer> currList, int[] input, boolean[] used){
		if(currList.size()==input.length){
			list.add(new ArrayList<Integer>(currList));
		}
		else{
			for(int i=0;i<input.length;i++){
				if(used[i] || i>0 && input[i]==input[i-1] && !used[i-1]) continue;//to add new elements 
				used[i]=true;
				currList.add(input[i]);
				permutationWithDuplicatesUtil(list,currList,input,used);
				used[i]=false;
				currList.remove(currList.size()-1);
			}
		}
	}
	
	public static void main(String...args){
		Permutation obj = new Permutation();
		List<List<Integer>> list = obj.permutationWithOutDuplicates(new int[]{1,2,3,4});
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j));
			}
			System.out.println();
		}
	}
	
}
