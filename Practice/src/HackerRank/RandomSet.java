package HackerRank;

public class RandomSet {
	public int[] getRandomSet(int[] n, int mSize){
		int m[] = new int[mSize];
		for(int i=0;i<mSize;i++){
			m[i]=n[i];
		}
		for(int i=mSize;i<n.length;i++){
			int k = 0 + (int)(Math.random() * i);
			if(k<mSize)
				m[k]=n[i];
		}
		return m;
	}
	
	public int[] shuffleCards(int cards[]){
		for(int i=0;i<cards.length;i++){
			int k = 0 + (int)(Math.random() * cards.length);
			int temp = cards[k];
			cards[k]=cards[i];
			cards[i]=temp;
		}
		return cards;
	}
}
