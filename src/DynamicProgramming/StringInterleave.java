package DynamicProgramming;

public class StringInterleave {
	
	public static void printArray(boolean[][] arr)
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
	
	
	public static void main(String[] args)
	{
		String a = "aaa";
		String b = "aaa";
		String c = "aaaaaa";
	    test ("XY", "X", "XXY");
	    test ("YX", "X", "XXY");
	    test ("XXY", "XXZ", "XXXXZY");
	}

	private static boolean test(String a, String b, String c) {
		
		int n = a.length()+1;
		int m = b.length()+1;
		boolean[][] mat = new boolean[a.length()+1][b.length()+1];
		
		//Base Case Filling.
		
		mat[0][0] = true;
		
		for(int i = 1 ; i < m ;i++)
		{
			if(b.charAt(i-1)==c.charAt(i-1))
			{
				if(mat[0][i-1])
					mat[0][i]=true;
				else
					mat[0][i]=false;
			}
			else
				mat[0][i]=false;
		}
		
		for(int i = 1;  i < n ; i++)
		{
			if(a.charAt(i-1)==c.charAt(i-1))
			{
				if(mat[i-1][0])
					mat[i][0]=true;
				else
					mat[i][0]=false;
			}
			else
				mat[i][0] = false;
		}
		
	
		int i = 0 ;
		int j = 0 ;
	
		for(i = 1 ; i < n ; i++)
		{
			for(j = 1 ; j < m ; j++)
			{
				if(c.charAt(i+j-1) == a.charAt(i-1))
				{
					mat[i][j]=mat[i-1][j];
				}
				else if(c.charAt(i+j-1)==b.charAt(j-1))
				{
					mat[i][j]=mat[i][j-1];
				}
				else
					mat[i][j]=false;
			}
		}	
		
		return mat[n-1][m-1];
	}

}
