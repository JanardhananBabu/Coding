package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	
	public List<List<Integer>> subsetWithOutDuplicates(int[] input){
		List<List<Integer>> list = new ArrayList<>();
		subsetWithOutDuplicatesUtil(list,new ArrayList<Integer>(),input,0);
		return list;
	}

	public void subsetWithOutDuplicatesUtil(List<List<Integer>> list, List<Integer> currList, int[] input, int start){

		ArrayList<Integer> currLst = new ArrayList<Integer>(currList);
		list.add(currLst);
		for(int i=start;i<input.length;i++){
			currLst.add(input[i]);
			subsetWithOutDuplicatesUtil(list,currLst,input,i+1);
			currLst.remove(currLst.size()-1);
		}
	}
	
	public static void main(String...args){
		Subset obj = new Subset();
		List<List<Integer>> list = obj.subsetWithOutDuplicates(new int[]{1,2,3,4});
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j));
			}
			System.out.println();
		}
	}
	
}
