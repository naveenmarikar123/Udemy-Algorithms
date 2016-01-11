package ShortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t>0)
		{
			//Number of Nodes 
			int n = in.nextInt();
			HashMap<Integer,Vertex> listOfVertex = new HashMap<Integer,Vertex>();
			for(int i = 0 ; i < n ; i++)
			{
				Vertex temp = new Vertex(String.valueOf(i+1));
				listOfVertex.put(i+1,temp);
			}
			
			//Number of Edges
			int e = in.nextInt();
			
			while(e > 0)
			{
				int i = in.nextInt();
				int j = in.nextInt();
				listOfVertex.get(i).list.add(listOfVertex.get(j)); // Undirected Graph.
				listOfVertex.get(j).list.add(listOfVertex.get(i));
				e--;
			}
			
			//Starting Point
			int root = in.nextInt();
			new BFS().bfs(listOfVertex.get(root));
			
			for(int i = 0 ; i < n ; i++)
			{
				if(root-1!=i)
				System.out.print(listOfVertex.get(i+1).dist+" ");
			}
			System.out.println();
			
			

			t--;
		}
		
	
		
	
	}

}
