package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
	
	public List<List<Integer>> combinationWithReplacements(int[] input, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(input);
		combinationWithReplacementsUtil(list,new ArrayList<Integer>(),target,input,0);
		return list;
	}

	public void combinationWithReplacementsUtil(List<List<Integer>> list, List<Integer> currList, int remain, int[] input, int start){
		if(remain<0) return;
		if(remain==0) list.add(new ArrayList<Integer>(currList));
		else{
			for(int i=start;i<input.length;i++){
				currList.add(input[i]);
				combinationWithReplacementsUtil(list, currList, remain-input[i], input, i);
				currList.remove(currList.size()-1);
			}
		}
	}
	
	public void combinationWithoutReplacementsUtil(List<List<Integer>> list, List<Integer> currList, int remain, int[] input, int start){
		if(remain<0) return;
		if(remain==0) list.add(new ArrayList<Integer>(currList));
		else{
			for(int i=start;i<input.length;i++){
				if(i>start && input[i]==input[i-1])continue;
				currList.add(input[i]);
				combinationWithoutReplacementsUtil(list, currList, remain-input[i], input, i+1);
				currList.remove(currList.size()-1);
			}
		}
	}
	
	public static void main(String...args){
		Combination obj = new Combination();
		List<List<Integer>> list = obj.combinationWithReplacements(new int[]{2,3,6,7},7);
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j));
			}
			System.out.println();
		}
	}
	
}
