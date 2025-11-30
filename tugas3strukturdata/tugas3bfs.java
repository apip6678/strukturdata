import java.util.*;

public class tugas3bfs {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, String neighbor) {
        graph.putIfAbsent(node, new ArrayList<>());
        graph.get(node).add(neighbor);
    }

    public void bfs(String startNode) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(startNode);
        queue.offer(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            System.out.print(currentNode + " ");

            if (graph.containsKey(currentNode)) {
                for (String neighbor : graph.get(currentNode)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        tugas3bfs g = new tugas3bfs();

        g.addEdge("a1", "a2");
        g.addEdge("a1", "a3");
        g.addEdge("a2", "a4");
        g.addEdge("a2", "a5");
        g.addEdge("a3", "a6");
        g.addEdge("a3", "a7");
        g.addEdge("a4", "a8");
        g.addEdge("a5", "a8");

        System.out.println("BFS Traversal: ");
        g.bfs("a1");
    }
}