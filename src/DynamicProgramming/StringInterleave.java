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
	    //test ("XY", "X", "XXY");
	    //test ("YX", "X", "XXY");
	    System.out.println(test ("XXY", "XXZ", "XXXXZY"));
	}

	private static boolean test(String a, String b, String c) {
		
		int n = a.length()+1;
		int m = b.length()+1;
		boolean[][] mat = new boolean[a.length()+1][b.length()+1];
		
		//Base Case Filling.
		int i = 0;
		int j = 0;
		try{
		for(i = 0 ; i < n ; i++)
		{
			for(j = 0 ; j < m ; j++)
			{
				if(i==0 && j==0)
					mat[i][j] = true;
				else if(i==0)
				{
					if((b.charAt(j-1)==c.charAt(i+j-1)))
					mat[i][j] = mat[i][j-1];
					else
						mat[i][j]=false;
				}
				else if(j==0)
				{
					if((a.charAt(i-1)==c.charAt(i+j-1)))
					mat[i][j] = mat[i-1][j];
					else
						mat[i][j]=false;
				}
				else if( (a.charAt(i-1)==c.charAt(i+j-1)) && !(b.charAt(j-1)==c.charAt(i+j-1)) )
				{
					mat[i][j] = mat[i-1][j];
				}
				else if( (a.charAt(i-1)!=c.charAt(i+j-1)) && (b.charAt(j-1)==c.charAt(i+j-1)) )
				{
					mat[i][j] = mat[i][j-1];
				}
				else if((a.charAt(i-1)==c.charAt(i+j-1)) && (b.charAt(j-1)==c.charAt(i+j-1)))
				{
					mat[i][j] = mat[i-1][j] || mat[i][j-1];
				}

			}
		
		}
		}
		catch(Exception e)
		{
			System.out.println(i+" "+j);
			System.out.println(a.charAt(i-1));
			System.out.println(b.charAt(j-1));
			System.out.println(c.charAt(i+j-1));
			
			e.printStackTrace();
		}
		
		return mat[n-1][m-1];
	}

}
