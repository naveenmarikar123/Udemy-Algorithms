package ShortestPath;

import java.util.ArrayList;

public class Vertex {
	
	public String label;
	public boolean visited;
	public int dist = -1;
	public ArrayList<Vertex> list;
	
	Vertex(String label)
	{
		this.label = label;
		list=new ArrayList<Vertex>();
	}
}
