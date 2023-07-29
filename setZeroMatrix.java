import java.util.*;
import java.io.*;

class setZeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[100][100];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();
			
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    for (int l = 0; l < 3; l++)
                        if(a[i][l]!=0)
							a[i][l] = -1;
					for (int m = 0; m < 3; m++)
                        if(a[m][j]!=0)
							a[m][j] = -1;
                }
            }
			for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]==-1)
					a[i][j]=0;
	System.out.print(a[i][j]+" ");}
	System.out.println("\n");}
    }
}