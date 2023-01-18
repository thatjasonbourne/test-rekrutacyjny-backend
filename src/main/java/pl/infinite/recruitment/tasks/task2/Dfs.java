package pl.infinite.recruitment.tasks.task2;

public class Dfs implements TreeSearch {

    @Override
    public Node search(Node root, Object value) {
        return searchRecursively(root, value);
    }

    private Node searchRecursively(Node node, Object value) {
        if (node.getValue().equals(value)) {
            return node;
        }
        Node result = null;
        if (node.getLeft() != null) {
            result = searchRecursively(node.getLeft(), value);
        }
        if (result == null && node.getRight() != null) {
            result = searchRecursively(node.getRight(), value);
        }
        return result;
    }
}
