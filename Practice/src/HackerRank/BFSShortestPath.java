package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSShortestPath {
    public static class Graph {
        
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int[] dist;
        boolean[] visited;
        public Graph(int size) {
            dist = new int[size];
            visited = new boolean[size];
        }

        public void addEdge(int first, int second) {
           if(map.get(first)==null){
        	   map.put(first, new ArrayList<Integer>());
           }
    	   map.get(first).add(second);
    	   if(map.get(second)==null){
        	   map.put(second, new ArrayList<Integer>());
           }
    	   map.get(second).add(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            Queue<Integer> list = new LinkedList<Integer>();
            list.add(startId);
            dist[startId]=0; // root depth
            while(!list.isEmpty()){
            	int curr = list.poll();
            	visited[curr]=true;
            	ArrayList<Integer> tempList = map.get(curr);
            	for(int a:tempList){
            		if(!visited[a]){
            			list.add(a);
                		dist[a]=dist[curr]+6;
            		}
            	}
            }
            return dist;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                	if(distances[i]>0)
                		System.out.print(distances[i]);
                	else
                		System.out.print("-1");
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}

