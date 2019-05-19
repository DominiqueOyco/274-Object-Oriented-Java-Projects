package week_15_lecture;

import java.util.ArrayList;

public class Tree {
	
	class Node{
		public Object data;
		public ArrayList<Node> children;
		
		public int size(){
			int sum = 1;
			for(Node child: children){
				sum += child.size(); //recursive call
			}
			return sum;
		}
		
		public String getContents(){
			String c = data.toString() + " "; //getting the contents of this node, as a string
			for(Node child : children){
				c+= child.getContents(); //getting the contents of its children
			}
			return c;
		}
	}
	
	private Node root;
	
	public Tree(Object data){
		root = new Node();
		root.data = data;
		root.children = new ArrayList<Node>();
	}
	
	/**
	 * adds a subtree to the list of children of this tree
	 * @param subtree - the Tree object to be added to the tree
	 */
	public void addSubtree(Tree subtree){
		root.children.add(subtree.root); //We only need a link to the root of the subtree
										//because through that link we have access to all
										//its descendants
	}
	
	/**
	 * gets the number of nodes in the tree
	 * @return the size as an integer
	 */
	public int size(){
		if(root == null) return 0; //This is if the tree is empty
		else return root.size(); //This is a call to the recursive method in the Node class
	}
	
	public String toString(){	
		return root.getContents();
	}
}