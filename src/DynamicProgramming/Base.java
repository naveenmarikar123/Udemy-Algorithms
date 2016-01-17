package DynamicProgramming;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "|name|address|~n|Patrick|patrick@test.com|pat@test.com|~n|Annie|annie@test.com|~n|Zoe|~n";
		String[] arr = line.split("~n");
		int records = arr.length-1;
		int fields = 0;
		int empty = 0;
		for(String x : arr)
		{
			String[] res = x.replace("|", ":").split(":");
			if(res.length-1>fields)
			fields = res.length-1;
		}
		
		for(int j = 1 ; j < arr.length ; j++)
		{
			String x = arr[j];
			String[] res = x.replace("|", ":").split(":");
			int count = 0;
			for(int i=1 ; i<res.length ; i++)
			{
				if(res[i].hashCode()!=0)
					count++;
				
			}
			empty = empty + fields-count;	
		}
		System.out.println("Number of records: "+records);
		System.out.println("Number of fields: "+fields);
		System.out.println("Number of empty :" + empty);

		

	}
	
	

}
