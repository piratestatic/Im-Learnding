import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<Vrtx> {
	//Starting node of the graph
	public Vrtx startingNode = null;

	//Map all the vertex to corresponding vertex
	Map<String, Vrtx> vertices = new HashMap<>();

	// Adjacency representation of the graph
	Map<Vrtx, ArrayList<Vrtx>> adjacencyList = new HashMap<>();

	// Track if a node/vertex is visited in the searching process
	Set<Vrtx> visited = new HashSet<>();

	// Representation utility
	ParenthesizedList hierarchy = new ParenthesizedList();
	Hierarchy parenthesizedList = new Hierarchy();

	// keep track if the graph contain a circle
	boolean cycle = false;

	Set<Vrtx> discovered = new HashSet<>();

	public void depthFirstSearch() {
		
		// Starting DFS from the first node of the input data
		dfs(startingNode);
	}

	private void dfs(Vrtx node) {
		//Search in the adjacency list in Depth-First-Order
		// Node to discover with all of it's child
		if (discovered.contains(node)) {
			cycle = true;
			// Perform DFS Actions Cycle Detected operation
			hierarchy.cycleDetected();
			parenthesizedList.cycleDetected();
			return;
		}
		//Perform DFSActions Vertex Add operation
		hierarchy.processVertex((Vertex) node);
		parenthesizedList.processVertex((Vertex) node);

		//Perform DFS Actions Descend Vertex operation
		hierarchy.descendVertex((Vertex) node);
		parenthesizedList.descendVertex((Vertex) node);

		//add node to discovery list
		discovered.add(node);
		// mark the node as visited
		visited.add(node);
		// discover all of it's child
		ArrayList<Vrtx> list = adjacencyList.get(node);
		if (list != null) {
			for (Vrtx fromNode : list)
				dfs(fromNode);
		}
		//Perform DFS Actions Ascend Vertex operation
		hierarchy.ascendVertex((Vertex) node);
		parenthesizedList.ascendVertex((Vertex) node);
		//remove node from the discovered list
		discovered.remove(node);
	}

	private Vrtx getVertex(String fromNode) {
		//get the Mapped vertex reference of a node(String)
		return vertices.get(fromNode);
	}

	public void displayUnreachableClasses(){

		for (Map.Entry<Vrtx, ArrayList<Vrtx>> entry : adjacencyList.entrySet()) {
			//for each entry check if there is any unvisited node
			if(entry.getValue().size()>0){
				//print if found and mark it
				if(!visited.contains(entry.getKey())){
					System.out.println(entry.getKey() + " is unreachable");
					visited.add(entry.getKey());
				}

				//check all adjacent nodes
				for (Vrtx vertex : entry.getValue()){

					if(!visited.contains(vertex)){
						System.out.println(vertex + " is unreachable");
						visited.add(vertex);
					}
				}
			}
		}
	}
}