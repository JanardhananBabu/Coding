package HackerRank;

public class QuickSort {

	public void quicksort(int array[]){
		if(array.length<1)return;
		quicksort(array,0,array.length-1);
	}
	public void quicksort(int[] array, int left, int right){
		if(left>=right)return;
		int pivot=array[array.length-1];
		int index = sort(array, left, right, pivot);
		if(index==array.length-1)return;//array is sorted
		else{
			quicksort(array,left,index-1);
			quicksort(array,index,right);
		}
	}
	public int sort(int[] array, int left, int right, int pivot){
		while(left<=right){
			while(array[left]<=pivot)left++;
			while(array[right]>=pivot)right--;
			if(array[left]>pivot&&array[right]<pivot){
				int temp = array[left];
				array[left]=array[right];
				array[right]=temp;
			}
		}
			array[array.length-1]=array[left];
			array[left]=pivot;
			return left;
	}
}
