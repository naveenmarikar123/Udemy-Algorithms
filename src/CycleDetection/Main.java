package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		Vertex vertex1 = new Vertex("A");
		Vertex vertex2 = new Vertex("B");
		Vertex vertex3 = new Vertex("C");
		
		vertex1.getNeighbors().add(vertex2);
		vertex2.getNeighbors().add(vertex3);
		vertex3.getNeighbors().add(vertex1);
		
		List<Vertex> list = new ArrayList<Vertex>();
		list.add(vertex1);
		list.add(vertex2);
		list.add(vertex3);
		
		CycleDetection obj = new CycleDetection();
		obj.detectCycles(list);
	}

}
