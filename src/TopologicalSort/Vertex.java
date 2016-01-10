package TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String label;
	private boolean visited;
	private List<Vertex> adjacentList;
	
	public Vertex(String label)
	{
		this.label = label;
		this.adjacentList = new ArrayList<Vertex>();
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacentList() {
		return adjacentList;
	}

	public void addVertex(Vertex v)
	{
		this.adjacentList.add(v);
	}
}
