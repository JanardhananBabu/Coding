package HackerRank;

public class MergeSort {

	public void mergeSort(int[] array){
		mergeSortRec(array,new int[array.length],0,array.length-1);
	}

	public void mergeSortRec(int[] array, int[] temp, int left, int right){
		if(left>=right)return;
		int mid = (left+right)/2;
		mergeSortRec(array,temp,left,mid);
		mergeSortRec(array,temp,mid+1,right);
		merge(array,temp,0,array.length-1);
	}

	public void merge(int[] array, int[] temp, int left, int right){
		int mid=(left+right)/2;
		int leftStart=left;
		int leftEnd=mid;
		int tempIndex=left;
		int rightStart=mid+1;
		int rightEnd=right;
		while(leftStart<=leftEnd && rightStart<=rightEnd){
			if(array[leftStart]<array[rightStart]){
				temp[tempIndex]=array[leftStart];
				leftStart++;
			}
			else{
				temp[tempIndex]=array[rightStart];
				rightStart++;
			}
			tempIndex++;
		}
		System.arraycopy(array, leftStart, temp, tempIndex,leftEnd-leftStart+1);
		System.arraycopy(array, rightStart, temp, tempIndex,rightEnd-rightStart+1);
		System.arraycopy(array, left, temp, left, array.length);
		
	}

}
