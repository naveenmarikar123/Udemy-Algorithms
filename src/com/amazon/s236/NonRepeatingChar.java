package com.amazon.s236;

import java.util.Arrays;

public class NonRepeatingChar {

	public static void main(String[] args) {
		//Find first non-repeating character
		// Sort the array first , if next element is not same , return , else go to next
		
		char arr[] = {'a','b','e','b','f','e','a','g'};
		Arrays.sort(arr);
		System.out.println(arr);
		for(int i = 0 ; i < arr.length-2 ; i++)
		{
			if(arr[i]==arr[i+1])
			{
				while(arr[i]==arr[i+1])
					i++;
				i--;
			}
			else if(arr[i]!=arr[i+1])
			{
				System.out.println(arr[i]);
				break;
			}
			
		}

	}

}
