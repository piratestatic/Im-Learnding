import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

	static DirectedGraph graph = new DirectedGraph();

	public void readGraph() {
		// Open file reader window
		JFileChooser choice = new JFileChooser(new File("."));
		int option = choice.showOpenDialog(null);

		//check if user selected a valid file then proceed further
		if (option == JFileChooser.APPROVE_OPTION) {
			try {
				// Take input from user input file using Scanner class from Java Utility
				Scanner input = new Scanner(choice.getSelectedFile());
				// Read the file line by line
				while (input.hasNextLine()) {
					String edgeString = input.nextLine();
					String[] edge = edgeString.split(" ");
					// Marks the first node of the graph
					// DFS starts from this node
					if (graph.startingNode == null)
						graph.startingNode = graph.getVertex(edge[0]);

					// add edges to the Directed graph
					for (int i = 1; i < edge.length; i++) {
						graph.addEdge(edge[0], edge[i]);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// Starting Depth First Search Utility to complete the DFS
		new Main().readGraph();
		graph.depthFirstSearch();
		// Display Parenthesized List after processing the vertices
		System.out.println(graph.parenthesizedList.toString());
		// Display Hierarchy after processing the vertices
		System.out.println(graph.hierarchy.toString());
		// Display all the nodes that remained unreachable in the searching process
		graph.displayUnreachableClasses();
	}
}