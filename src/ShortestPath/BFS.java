package ShortestPath;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public void bfs(Vertex root)
	{
		root.visited = true;
		root.dist = 0;
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			Vertex temp = queue.poll();
			for(Vertex x : temp.list)
			{
				if(!x.visited)
				{
					x.visited=true;
					if(x.dist==-1)
					x.dist=temp.dist+6;
					queue.offer(x);
				}
			}
		}
		
	}

}
