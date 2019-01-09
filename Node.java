package morsecode;

public class Node {

	private String key = " ";
	private Node left = null;
	private Node right = null;

	public Node(String key) {
    	this.key = key;
    	right = null;
    	left = null;
	}

	public void setKey(String key) {
    	this.key = key;
	}

	public String getKey() {
    	return key;
	}

	public void setLeft(Node left) {
    	this.left = left;
	}

	public Node getLeft() {
    	return left;
	}

	public void setRight(Node right) {
    	this.right = right;
	}

	public Node getRight() {
    	return right;
	}

}




