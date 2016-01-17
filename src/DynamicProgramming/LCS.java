package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LCS {
	
	public static void printArray(int[][] arr)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[0].length ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void printLCS(char[][] arr  , int in[], int i , int j )
	{
		
		if(i==0 || j==0)
			return;
		if(arr[i][j] == 'D')
		{
			arr[i][j] = 'v';
			printLCS(arr,in,i-1,j-1);
			System.out.print(in[i-1]);
		}
		else if(arr[i][j]=='U')
			printLCS(arr,in,i-1,j);
		else
			printLCS(arr,in,i,j-1);
		
	}

public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        minDistance("a","b");
		
	
 
    }

public static int minDistance(String a, String b) {
    
    int n = a.length();
    int m = b.length();
    
    int[][] mat = new int[n+1][m+1];
    
    // Base case to transform to null string
    for(int i = 0 ; i < n+1 ; i++)
    mat[i][0]=i;
    
    for(int i = 0 ; i < m+1 ; i++)
    mat[0][i] = i;
    
    printArray(mat);
    
    for(int i = 1 ; i < n+1 ; i++)
    {
        for(int j = 1 ; j < m+1 ; j++)
        {
            if(a.charAt(i-1)==b.charAt(j-1))
            mat[i][j]=mat[i-1][j-1];
            else
            mat[i][j]=Math.min(mat[i-1][j],Math.min(mat[i-1][j-1],mat[i][j-1]))+1;
        }
        
    }
    
    printArray(mat);
    
    return mat[n][m];
}


}
