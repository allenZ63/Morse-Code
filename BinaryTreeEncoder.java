package morsecode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BinaryTreeEncoder {

	private Node root;
	private HashMap<String, String> hm = new HashMap();

	public static void main(String[] args) {

	}

	public BinaryTreeEncoder() {
    	this.root = new Node("");
	}

	public void setRoot(Node root) {
    	this.root = root;
	}

	public Node getRoot() {
    	return root;
	}
    
	public void setHm(HashMap hm) {
    	this.hm = hm;
	}

	public HashMap<String, String> getHm() {
    	return hm;
	}

	public void setup() throws FileNotFoundException, IOException {

    	String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        	"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
        	"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " "};

    	String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        	"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
        	"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        	"-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....",
        	"--...", "---..", "----.", "-----", " "};

    	for (int i = 0; i < morseCode.length; i++) {
        	hm.put(letters[i], morseCode[i]);
    	}

    	BinaryTreeDecoder tree = new BinaryTreeDecoder();

    	Node a = new Node(letters[0]);
    	Node b = new Node(letters[1]);
    	Node c = new Node(letters[2]);
    	Node d = new Node(letters[3]);
    	Node e = new Node(letters[4]);
    	Node f = new Node(letters[5]);
    	Node g = new Node(letters[6]);
    	Node h = new Node(letters[7]);
    	Node i = new Node(letters[8]);
    	Node j = new Node(letters[9]);
    	Node k = new Node(letters[10]);
    	Node l = new Node(letters[11]);
    	Node m = new Node(letters[12]);
    	Node n = new Node(letters[13]);
    	Node o = new Node(letters[14]);
    	Node p = new Node(letters[15]);
    	Node q = new Node(letters[16]);
    	Node r = new Node(letters[17]);
    	Node s = new Node(letters[18]);
    	Node t = new Node(letters[19]);
    	Node u = new Node(letters[20]);
    	Node v = new Node(letters[21]);
    	Node w = new Node(letters[22]);
    	Node x = new Node(letters[23]);
    	Node y = new Node(letters[24]);
    	Node z = new Node(letters[25]);
    	Node one = new Node(letters[26]);
    	Node two = new Node(letters[27]);
    	Node three = new Node(letters[28]);
    	Node four = new Node(letters[29]);
    	Node five = new Node(letters[30]);
    	Node six = new Node(letters[31]);
    	Node seven = new Node(letters[32]);
    	Node eight = new Node(letters[33]);
    	Node nine = new Node(letters[34]);
    	Node zero = new Node(letters[35]);
    	Node blankOne = new Node(letters[36]);
    	Node blankTwo = new Node(letters[36]);
    	Node blankThree = new Node(letters[36]);

    	tree.add(root, e, "left"); //1st layer
    	tree.add(root, t, "right");

    	tree.add(e, i, "left"); //2nd layer
    	tree.add(e, a, "right");
    	tree.add(t, n, "left");
    	tree.add(t, m, "right");

    	tree.add(i, s, "left"); //3rd layer
    	tree.add(i, u, "right");
    	tree.add(a, r, "left");
    	tree.add(a, w, "right");
    	tree.add(n, d, "left");
    	tree.add(n, k, "right");
    	tree.add(m, g, "left");
    	tree.add(m, o, "right");

    	tree.add(s, h, "left"); //4th layer
    	tree.add(s, v, "right");
    	tree.add(u, f, "left");
    	tree.add(u, blankOne, "right");
    	tree.add(r, l, "left");
    	tree.add(w, p, "left");
    	tree.add(w, j, "right");
    	tree.add(d, b, "left");
    	tree.add(d, x, "right");
    	tree.add(k, c, "left");
    	tree.add(k, y, "right");
    	tree.add(g, z, "left");
    	tree.add(g, q, "right");
    	tree.add(o, blankTwo, "left");
    	tree.add(o, blankThree, "right");

    	tree.add(h, five, "left"); //5th layer
    	tree.add(h, four, "right");
    	tree.add(v, three, "right");
    	tree.add(blankOne, two, "right");
    	tree.add(j, one, "right");
    	tree.add(b, six, "left");
    	tree.add(z, seven, "left");
    	tree.add(blankTwo, eight, "left");
    	tree.add(blankThree, nine, "left");
    	tree.add(blankThree, zero, "right");
	}

	public void add(Node parent, Node child, String orientation) {
    	if (orientation.equals("left")) {
        	parent.setLeft(child);
    	} else {
        	parent.setRight(child);
    	}
	}

	public String search(String s) {
    	return search(root, s);
	}

	private String search(Node root, String s) {
    	String result = "";
    	if (root == null) {
        	return " ";
    	}
    	if (root.getKey().equals(s)) {
        	if (root.getKey() == null) {
            	return " ";
        	}
        	return hm.get(s);
    	}
    	if (root.getLeft() != null && root.getRight() != null) {
        	return search(root.getLeft(), s) + search(root.getRight(), s);
    	}
    	if (root.getLeft() != null) {
        	return search(root.getLeft(), s);
    	}
    	if (root.getRight() != null) {
        	return search(root.getRight(), s);
    	}
    	return result;
	}

	public void print() {
    	print(root);
    	System.out.println(); // end the line of output
	}

	private void print(Node root) {
    	if (root != null) {
        	print(root.getLeft());
        	System.out.print(root.getKey() + " ");
        	print(root.getRight());
    	}
	}
}





