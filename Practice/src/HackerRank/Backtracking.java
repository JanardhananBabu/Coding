package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {

	public void subset(List<List<Integer>> list, List<Integer> currList, int[] input, int start){
		ArrayList<Integer> tempList = new ArrayList<Integer>(currList);
		list.add(tempList);
		for(int i=start;i<input.length;i++){
			//if(i>start&&input[i]==input[i-1])continue;
			tempList.add(input[i]);
			subset(list,tempList,input,i+1);
			tempList.remove(tempList.size()-1);
		}
	}
	
	public void permutaion(List<List<Integer>> list, List<Integer> currList, int[] input){//,boolean used[]){
		ArrayList<Integer> tempList = new ArrayList<Integer>(currList);
		if(tempList.size()==input.length){
			list.add(tempList);
		}
		for(int i=0;i<input.length;i++){
			if(tempList.contains(input[i]))continue;//if(used[i]||i>0&&input[i]&&!used[i-1]) continue;
			//used[i]=true;
			tempList.add(input[i]);
			permutaion(list,tempList,input);
			//used[i]=false;
			tempList.remove(tempList.size()-1);
		}
	}
	
	public void combination(List<List<Integer>> list, List<Integer> currList, int remain, int[] input, int start){
		if(remain<0) return;
		ArrayList<Integer> tempList = new ArrayList<Integer>(currList);
		if(remain==0){
			list.add(tempList);
		}
		else
		for(int i=start;i<input.length;i++){
			 //if(i > start && input[i] == input[i-1]) continue;
			tempList.add(input[i]);
			combination(list,tempList,remain-input[i],input,i);//,i++);
			tempList.remove(tempList.size()-1);
		}
	}
	
}
