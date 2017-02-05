package HackerRank;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class NFLdataStream {

	static class PlayerOrder implements Comparable<PlayerOrder>{
		int id;
		long points;
		PlayerOrder(int id, long points)
		{
			this.id=id;
			this.points=points;
		}
		@Override
		public int compareTo(PlayerOrder other) {
			if(this.points==other.points){
				return Integer.compare(this.id, other.id);
			}
			else{
				return  Long.compare(this.points, other.points);
			}
		}
	}

	public static void main(String...args){
		Scanner scan = new Scanner(System.in);
		PriorityQueue<PlayerOrder> list = new PriorityQueue<>();
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			long points;
			if(str.equals("PRINT")){
				System.out.println("Leaders");
				int rank=1;
				Stack<PlayerOrder> stack = new Stack<>();
				while(list.size()>0){
					stack.push(list.poll());
				}
				while(!stack.isEmpty()){
					PlayerOrder p = (PlayerOrder)stack.peek();
					System.out.println(rank+","+p.id+","+p.points);
					list.add(stack.pop());
					rank++;
				}
			}
			else{	
				String[] arr = str.split(",");
				points = (Integer.parseInt(arr[1])*2) + Integer.parseInt(arr[2]) + (Integer.parseInt(arr[3])*6) - Integer.parseInt(arr[4]);
				if(list.size()<10)
					list.add(new PlayerOrder(Integer.parseInt(arr[0]),points));
				else{
					list.add(new PlayerOrder(Integer.parseInt(arr[0]),points));
					list.poll();
				}
			}
		}

	}

}
