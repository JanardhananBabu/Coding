package HackerRank;

public class InsertionSort {

	public static void insertionsort(int[] array){
		if(array.length<1)return;
		int i=0;
		while(i<array.length){
			int curr= array[i];
			for(int j=i-1;j>=0;j--){
				if(curr<array[j]){
					array[j+1]=array[j];
					array[j] = curr;
				}
			}
			i++;
		}
	}
	
	public static void main(String...args){
		int[] arr = new int[]{5,8,1,3,9,6};
		insertionsort(arr);
		for(int a: arr){
			System.out.print(a+" ");
		}
	}
}
