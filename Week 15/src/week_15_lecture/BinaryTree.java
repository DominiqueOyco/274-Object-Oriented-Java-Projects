package week_15_lecture;

public class BinaryTree {
	
	class Node{
		public Object data;
		public Node left;
		public Node right;
	}
	
	private Node root;
	public BinaryTree(){
		root = null;
	}
	
	/**
	 * overloaded constructor, creates a binary tree without children
	 * @param data - the data to be stored in the root of this tree
	 */
	public BinaryTree(Object data){
		root = new Node();
		root.data = data;
		root.left = null;
		root.right = null;
	}
	
	/**
	 * overloaded constructor creates a binary tree with the given data and children
	 * @param data - the data to be stored in the root of this tree
	 * @param leftSubtree - BinaryTree object to be linked as the left child of the root
	 * @param rightSubtree - Binary Tree object to be linked as the right child of the root
	 */
	public BinaryTree(Object data, BinaryTree leftSubtree, BinaryTree rightSubtree){
		root = new Node();
		root.data = data;
		if(leftSubtree != null) root.left = leftSubtree.root;
		else root.left = null;
		
		if(rightSubtree != null) root.right = rightSubtree.root;
		else root.right = null;	
	}
	
	/**
	 * gets the left subtree of this binary tree
	 * @return the left subtree as a BinaryTree object
	 */
	public BinaryTree getLeft(){
		BinaryTree leftSubtree = new BinaryTree();
		leftSubtree.root = root.left;
		return leftSubtree;
	}
	
	/**
	 * gets the right subtree of this binary tree
	 * @return the right subtree as a BinaryTree object
	 */
	public BinaryTree getRight(){
		BinaryTree rightSubtree = new BinaryTree();
		rightSubtree.root = root.right;
		return rightSubtree;
	}
	
	//recursive helper method that stores the contents of the binary tree in a string
	private static String getContents(BinaryTree t){
		String c = " ";
		if(t.root != null){//if the tree is NIT empty
			c += t.root.data.toString() + " " + getContents(t.getLeft()) + " " + getContents(t.getRight());
		}
		return c;
	}
	
	public String toString(){
		return getContents(this);
	}
}
