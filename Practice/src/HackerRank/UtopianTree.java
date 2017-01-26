package HackerRank;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            boolean summer = false;
            int height=1;
            while(n!=0){
                if(!summer){
                    height=height*2;
                    summer=true;
                }
                else{
                    height=height+1;
                    summer=false;
                }
                n--;
            }
            System.out.println(height);
        }
    }
}
