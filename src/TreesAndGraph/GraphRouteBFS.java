package TreesAndGraph;

import java.util.PriorityQueue;
import java.util.Queue;

public class GraphRouteBFS {

    public boolean checkIfRouteExists(Graph graph, Node node1, Node node2) {

        if (graph == null || graph.nodes == null || graph.nodes.length == 0) {
            return false;
        }
        for (Node node : graph.nodes) {
            node1.marked = false;
            node2.marked = false;
            boolean result = breadthFirstSearch(node, node1, node2);
            if (result) {
                return result;
            }
        }
        return false;
    }

    public boolean breadthFirstSearch(Node node, Node node1, Node node2) {

        Queue<Node> queue = new PriorityQueue<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentRoot = queue.remove();
            currentRoot.marked = true;
            if (currentRoot.adjacent != null && currentRoot.adjacent.length > 0) {
                for (Node adjNode : currentRoot.adjacent) {
                    if (!adjNode.marked) {
                        adjNode.marked = true;
                        queue.add(adjNode);
                        if (node1.marked && node2.marked) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Graph graph = new Graph();

        Node node0 = new Node();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();

        node0.adjacent = new Node[]{node1};
        node1.adjacent = new Node[]{node2, node7};
        node2.adjacent = new Node[]{node0, node3};
        node3.adjacent = new Node[]{node0};

        node4.adjacent = new Node[]{node6};
        node5.adjacent = new Node[]{node4};
        node6.adjacent = new Node[]{node5};

        graph.nodes = new Node[]{node0, node4};

        GraphRouteBFS graphRoute = new GraphRouteBFS();
        boolean result = graphRoute.checkIfRouteExists(graph, node7, node2);
        System.out.println(result);
    }

}
