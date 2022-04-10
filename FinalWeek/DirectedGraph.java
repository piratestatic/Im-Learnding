import java.util.*;

public class DirectedGraph extends Graph<Vertex> {
	public void addEdge(String fromNode, String toNode) {
		// Check source node for connected edges
		ArrayList<Vertex> list = adjacencyList.get(getVertex(fromNode));
		// if already not in the Adjacency list
		// Map it to a new Vertex and initialize
		if (list == null) {
			list = new ArrayList<>();
		}
		//add a edge to source to destination
		list.add(getVertex(toNode));
		// update the adjacency list
		adjacencyList.put(getVertex(fromNode), list);
	}

	public Vertex getVertex(String fromNode) {
		// if first seen map to corresponding vertex
		if (!vertices.containsKey(fromNode)) {
			vertices.put(fromNode, new Vertex(fromNode));
		}
		return vertices.get(fromNode);
	}
}