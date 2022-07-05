import java.util.*;
import java.lang.*;
import java.io.*;

public class AlternateMatrixTraversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] mat = new int[m][n];

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < m ; i++){
            if(i%2==0){
                for(int j = 0; j<n ; j++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j= n-1 ; j>=0 ; j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
}



