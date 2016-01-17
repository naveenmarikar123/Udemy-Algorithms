package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSizeOfRect {
	
	public static void main(String[] args) throws IOException
	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String line = br.readLine();
//		
//		String[] inputs = line.split(" ");
//		
//		// Give number of rows and columns
//		int n = Integer.parseInt(inputs[0]);
//		int m = Integer.parseInt(inputs[1]);
//		
//		for
		
		int arr[] = {2,2,3,4,5};
		
		System.out.println(getMaxArea(arr));
		

		
	}
	
	public static int getMaxArea(int arr[])
	{
		int maxArea = arr[0];
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(maxArea<arr[i])
			{
				maxArea += maxArea;;
			}
		}
		return maxArea;
	}

}
