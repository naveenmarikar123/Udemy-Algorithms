package DynamicProgramming;

public class CoinChange {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,6}; // Coins in sorted order
		int amount  = 11; // Amount Required.
		
		System.out.println(getMinimum(arr,amount));	
	}

	private static int getMinimum(int[] arr, int amount) {
		
		int temp[] = new int[amount+1];
		temp[0] = 0;
		for(int i = 1; i < temp.length ; i++)
		{
			temp[i] = Integer.MAX_VALUE-1;
		}
		
		for(int i = 0 ; i < arr.length ; i++) // Iterating through all coins
		{
			for(int j = 1 ; j < temp.length ; j++)
			{
				if(j>=arr[i])
				{
					temp[j] = Math.min(temp[j], 1+temp[j-arr[i]]);
				}
				System.out.print(temp[j]+" ");
			}
			System.out.println();
		}
		
		return temp[amount];
		
		

	}
		

	

}
