package HackerRank;

import java.util.Scanner;

public class GridSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for(int G_i=0; G_i < R; G_i++){
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for(int P_i=0; P_i < r; P_i++){
				P[P_i] = in.next();
			}
			boolean result = false;
			for(int G_i=0,P_i=0;G_i<=R-r+1&&(!result);G_i++){
				for(int G_j=0,P_j=0;G_j<=C-c+1&&(!result);G_j++){
					if(G[G_i].charAt(G_j)!=P[0].charAt(0)){
						P_i=0;
						P_j=0;
						continue;
					}
					else{
						for(int g_i=G_i;P_i<r&&g_i<G_i+r&&(!result);P_i++,g_i++){
							for(int g_j=G_j;P_j<c&&g_j<G_j+c&&(!result);P_j++,g_j++){
								if(G[g_i].charAt(g_j)!=P[P_i].charAt(P_j)){
									P_i=0;
									P_j=0;
									break;
								}
							}
						}
                        
							if((P_i==r)&&(P_j==c)){
								result=true;
							}

					}
				}
			}

			if(result){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}
	}
}
