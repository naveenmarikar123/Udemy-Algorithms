package CycleDetection;

import java.util.*;

public class CycleDetection {
	
	public void detectCycles(List<Vertex> listOfVertices)
	{
		for(Vertex vertex : listOfVertices)
		{
			if(!vertex.isVisited())
			{
				vertex.setVisited(true);
				System.out.println("HERE");
				dfs(vertex);
			}
		}	
	}

	private void dfs(Vertex vertex) {
		
		vertex.setVisited(false);
		vertex.setBeingVisited(true);
		
		for(Vertex x : vertex.getNeighbors())
		{
			if(x.isBeingVisited())
			{
				System.out.println("CYCLE DETECTED");
				return;
			}
			
			if(!x.isVisited())
			{
				x.setVisited(true);
				dfs(x);
			}
		}
		
		vertex.setVisited(true);
		vertex.setBeingVisited(false);
		
	}

}
