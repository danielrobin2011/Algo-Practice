package TreesAndGraph;

public class GraphRoute {

    // using DFS to find if there is a route between two nodes in a directed graph
    public boolean checkIfRouteExists(Graph graph, Node node1, Node node2) {

        if (graph == null || graph.nodes == null || graph.nodes.length == 0) {
            return false;
        }
        for (Node node : graph.nodes) {
            node1.marked = false;
            node2.marked = false;
            boolean result = depthFirstSearch(node, node1, node2);
            if (result) {
                return result;
            }
        }
        return false;
    }

    public boolean depthFirstSearch(Node node, Node node1, Node node2) {
        if (node == null) {
            return false;
        }
        node.marked = true;
        // check if node1 & node2 visited
        if (node1.marked && node2.marked) {
            return true;
        }
        if (node.adjacent != null || node.adjacent.length > 0) {
            for (Node child : node.adjacent) {
                if (!child.marked) {
                    return depthFirstSearch(child, node1, node2);
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

        node0.adjacent = new Node[]{node1};
        node1.adjacent = new Node[]{node2};
        node2.adjacent = new Node[]{node0, node3};
        node3.adjacent = new Node[]{node0};

        node4.adjacent = new Node[]{node6};
        node5.adjacent = new Node[]{node4};
        node6.adjacent = new Node[]{node5};

        graph.nodes = new Node[]{node0, node4};

        GraphRoute graphRoute = new GraphRoute();
        boolean result = graphRoute.checkIfRouteExists(graph, node4, node6);
        System.out.println(result);
    }

}
