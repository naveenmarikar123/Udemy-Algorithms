package DynamicProgramming;

import java.util.ArrayList;

public class Similarity {
	
	public static void main(String[] args)
	{
		
		long num = 4L;
		System.out.println(num==4I);
		
		

s
	}
	
	
	
	 public static int getNumberOfOnes(int num)
	    {
	        int count = 0;
	        while(num!=0)
	        {
	            count = count + num%2;
	            num=num/2;
	        }
	        return count;
	    }
	public static int[] StringSimilarity(String[] inputs) {
		String main = inputs[0];
		for(int i = 0 ; i < main.length() ; i++)
		{
			String temp = main.substring(i,main.length());
			System.out.println(temp);
		}
		return null;
    }
	


}
