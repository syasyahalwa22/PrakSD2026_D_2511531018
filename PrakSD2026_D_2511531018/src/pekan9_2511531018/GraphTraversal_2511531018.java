package pekan9_2511531018;

import java.util.*;

public class GraphTraversal_2511531018 {
	private Map<String, List<String>> graph_1018 = new HashMap<>();
	
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge(String node1, String node2) {
		graph_1018.putIfAbsent(node1, new ArrayList<>());
		graph_1018.putIfAbsent(node2, new ArrayList<>());
		graph_1018.get(node1).add(node2);
		graph_1018.get(node2).add(node1);
	}
	// Menampilkan graf awal
	public void printGraph() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_1018 : graph_1018.keySet()) {
			System.out.print(node_1018 + " -> ");
			List<String> neighbors = graph_1018.get(node_1018);
			System.out.println(String.join(", ", neighbors));
		}
		System.out.println();
	}
	
	// DFS rekursif
	public void dfs_1018(String start_1018) {
		Set<String> visited_1018 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_1018(start_1018, visited_1018);
		System.out.println();
	}
	private void dfsHelper_1018(String current_1018, Set<String> visited) {
		if (visited.contains(current_1018)) return;
		visited.add(current_1018);
		System.out.print(current_1018 + " ");
		for (String neighbor : graph_1018.getOrDefault(current_1018, new ArrayList<>())) {
			dfsHelper_1018(neighbor, visited);
		}
	}
	
	// BFS iteratif
	public void bfs_1018(String start_1018) {
		Set<String> visited_1018 = new HashSet<>();
		Queue<String> queue_1018 = new LinkedList<>();
		queue_1018.add(start_1018);
		visited_1018.add(start_1018);
		System.out.println("Penelusuran BFS: ");
		while (!queue_1018.isEmpty()) {
			String current_1018 = queue_1018.poll();
			System.out.print(current_1018 + " ");
			for (String neighbor : graph_1018.getOrDefault(current_1018, new ArrayList<>())) {
				if (!visited_1018.contains(neighbor)) {
					queue_1018.add(neighbor);
					visited_1018.add(neighbor);
				}
			}
		}
		System.out.println();
	}
	// Main
	public static void main(String[] args) {
		GraphTraversal_2511531018 graph_1018 = new GraphTraversal_2511531018();
		
		//Contoh graf: A-B, A-C, B-D, B-E
		graph_1018.addEdge("A", "B");
		graph_1018.addEdge("A", "C");
		graph_1018.addEdge("B", "D");
		graph_1018.addEdge("B", "E");
		//Cetak graf awal
		System.out.println("Graf Awal adalah: ");
		graph_1018.printGraph();
		//Lakukan penelusuran
		graph_1018.dfs_1018("A");
		graph_1018.bfs_1018("A");
	}

}
