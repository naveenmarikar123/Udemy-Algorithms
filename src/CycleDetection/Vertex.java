package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String label;
	private boolean isVisited;
	private boolean beingVisited;
	private List<Vertex> neighbors ;
	
	public Vertex(String label)
	{
		this.label = label;
		neighbors = new ArrayList<Vertex>();
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getNeighbors() {
		return neighbors;
	}
	
	

}
