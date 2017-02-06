package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DFSIslands {
	
    static int grid[][];
    static int count;
    
    public static int getBiggestRegion(int[][] grid) {
        int max=0;
        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
             DFS(i,j);
             if(count>max)max=count;
             count=0;
            }
        }
        return max;
    } 
    
    public static void DFS(int i, int j){
    	if(i<0||j<0||i>=grid.length||j>=grid[0].length)
        	return;
        if(grid[i][j]==0) return;
        if(grid[i][j]==1){
        	count++;
        	grid[i][j]=0;
        }
        DFS(i-1,j-1);
        DFS(i-1,j);
        DFS(i-1,j+1);
        DFS(i,j-1);
        DFS(i,j+1);
        DFS(i+1,j-1);
        DFS(i+1,j);
        DFS(i+1,j+1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        grid = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}