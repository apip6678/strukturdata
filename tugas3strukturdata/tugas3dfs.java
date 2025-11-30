import java.util.*;

public class tugas3dfs {
    private Map<String, List<String>> graph = new HashMap<>();


    public void addEdge(String node, String neighbor) {
        graph.putIfAbsent(node, new ArrayList<>());
        graph.get(node).add(neighbor);
    }


    public void dfs(String startNode, Set<String> visited) {
        System.out.print(startNode + " ");
        visited.add(startNode);

        if (graph.containsKey(startNode)) {
            for (String neighbor : graph.get(startNode)) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        tugas3dfs g = new tugas3dfs();

        //Menambahkan node dan hubungan antar node
        g.addEdge("a1", "a2");
        g.addEdge("a1", "a3");
        g.addEdge("a2", "a4");
        g.addEdge("a2", "a5");
        g.addEdge("a3", "a6");
        g.addEdge("a3", "a7");
        g.addEdge("a4", "a8");
        g.addEdge("a5", "a8");

        //Set untuk melacak node yang sudah dikunjungi
        Set <String> visited = new HashSet<>();

        System.out.println("DFS Traversal: ");
        g.dfs("a1", visited);
    }
}