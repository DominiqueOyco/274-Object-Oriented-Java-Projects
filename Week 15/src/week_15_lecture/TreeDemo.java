package week_15_lecture;

public class TreeDemo {
	
	
	public static void main(String[] args) {
//		Tree a = new Tree("I: George V");
//		Tree a1 = new Tree("IIa. Edward VIII");
//		Tree a2 = new Tree("IIb. George VI");
//		Tree a3 = new Tree("IIc. Mary");
//		Tree a4 = new Tree("IId. Henry");
//		Tree a5 = new Tree("IIe. George");
//		
//		Tree a51 = new Tree("IIIc. Edward");
//		Tree a52 = new Tree("IIId. Michael");
//		Tree a53 = new Tree("IIIe. Alexandra");
//		
//		Tree a21 = new Tree("IIIa. Batman");
//		Tree a22 = new Tree("IIIb. Wonder Woman");
//		
//		a2.addSubtree(a21);
//		a2.addSubtree(a22);
//		a5.addSubtree(a51);
//		a5.addSubtree(a52);
//		a5.addSubtree(a53);
//		
//		a.addSubtree(a1);
//		a.addSubtree(a2);
//		a.addSubtree(a3);
//		a.addSubtree(a4);
//		a.addSubtree(a5);
//		
//		System.out.println(a.size());
//		System.out.println(a);
		
		
		BinaryTree l41 = new BinaryTree("IVa"); //leaf node
			
		BinaryTree l31 = new BinaryTree("IIIa", null, l41); //this has a right child only
		BinaryTree l32 = new BinaryTree("IIIb"); 
		BinaryTree l21 = new BinaryTree("IIa", l31, l32);
		
		BinaryTree l33 = new BinaryTree("IIIc");
		BinaryTree l34 = new BinaryTree("IIId");
		BinaryTree l22 = new BinaryTree("IIb", l33, l34);
		
		BinaryTree l1 = new BinaryTree("I", l21, l22);
//		System.out.println(l1.height());
		
		System.out.println(l1);
		
	}
}
