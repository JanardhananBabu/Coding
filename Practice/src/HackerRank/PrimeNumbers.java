package HackerRank;

import java.util.ArrayList;

public class PrimeNumbers {
	
	public static ArrayList<Integer> findPrime(int n){
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] arr = new boolean[n];
		arr[0]=true;
		for(int i=2;i<=Math.sqrt(n);i++){
			for(int j=2;j<=n;j++){
				if(!arr[j-1]&&j!=i){
					if(j%i==0){
						arr[j-1]=true;
					}
				}
			}
		}
		for(int k=0;k<n;k++){
			if(!arr[k])
				list.add(k+1);
		}
		return list;
	}
	public static void main(String...args){
		ArrayList<Integer> list =findPrime(1000);
		for(Integer a:list)
			System.out.print(a+" ");
	}
}
