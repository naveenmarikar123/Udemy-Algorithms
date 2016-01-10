package TopologicalSort;

import java.util.Stack;

public class Ordering {
	
	Stack<Vertex> stack;
	
	public Ordering()
	{
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex root)
	{
		root.setVisited(true);
		
		for(int i = 0 ; i < root.getAdjacentList().size() ; i++)
		{
			if(!root.getAdjacentList().get(i).isVisited())
			{
				root.getAdjacentList().get(i).setVisited(true);
				dfs(root.getAdjacentList().get(i));
			}
		}
		stack.push(root);
	}
	
	public static void main(String[] args)
	{
		Vertex x = new Vertex("A");
		Vertex y = new Vertex("B");
		Vertex z = new Vertex("C");
		x.getAdjacentList().add(y);
		x.getAdjacentList().add(z);
		
		z.getAdjacentList().add(y);
		
		Ordering obj = new Ordering();
		
		obj.dfs(x);
		
		for(int i = 0 ; i < obj.stack.size() ; i++)
		{
			System.out.println(obj.stack.get(i).getLabel());
		}
		
	}

}
