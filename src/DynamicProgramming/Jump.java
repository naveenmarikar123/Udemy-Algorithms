package DynamicProgramming;

public class Jump {

	public static void main(String[] args) {
		
//		int arr[] = {1 ,1 ,0, 5, 2 };
//		System.out.println(goJump(arr,0));
		
		String line = "WHAAT//HELLO";
		StringBuilder res = new StringBuilder();
		res
		System.out.println(line.substring(line.indexOf("//")));

	}

	private static boolean goJump(int[] arr, int i) {
		if(i>=arr.length-1)
			return true;
		if(i<0 )
			return false;
		int jump;
		jump = arr[i];
		if(jump==0)
			return false;
		goJump(arr,i+jump);
		//goJump(arr,i-jump);
		return false;	
	}

}
