package pl.infinite.recruitment.tasks.task2;

public class Node {
	private Object value;
	private Node left;
	private Node right;

	public Node(Object value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public Object getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
}
