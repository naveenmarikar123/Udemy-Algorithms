package DynamicProgramming;

public class DistinctSub {
	
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
	
	public static int numDistinct(String S, String T) {
	    int sl = S.length();
	    int tl = T.length();

	    int [][] dp = new int[tl+1][sl+1];

	    for(int i=0; i<=sl; ++i){
	        dp[0][i] = 1;
	    }

	    for(int t=1; t<=tl; ++t){

	        for(int s=1; s<=sl; ++s){
	            if(T.charAt(t-1) != S.charAt(s-1)){
	                dp[t][s] = dp[t][s-1];
	            }else{
	                dp[t][s] = dp[t][s-1] + dp[t-1][s-1];
	            }
	        }   
	    }
	    
	    printArray(dp);

	    return dp[tl][sl];
	}
	
	public static void main(String[] args)
	{
		String a = "rabbbit";
		String b = "rabbit";
		
		numDistinct(a,b);
		
		
		
	}

}
