package HackerRank;

public class NumberOfIslands {
	    static char[][] grid;

	    public static void islandDFS(int i,int j){
	        
	    if(i<grid.length && j<grid[0].length && i>=0 && j>=0)
	        if(grid[i][j]=='1'){
	            grid[i][j]=0;
	                 islandDFS(i,j+1);
	                 islandDFS(i+1,j);
	                 islandDFS(i,j-1);
	                 islandDFS(i-1,j);
	        }
	    }

	    public static int numIslands(char[][] in_grid) {
	        grid=in_grid;
	        int count=0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[i].length;j++){
	                if(grid[i][j]=='1'){count++;}
	                islandDFS(i,j);
	            }
	        }
	        System.out.println(count);
	    return count;
	    }

}
