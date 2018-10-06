package ydp.fa.programs;

public class BinarySubTree {
	Node root1,root2;
	
	public boolean isIdentical(Node root1,Node root2) {
		if(root1== null && root2 == null) {
			System.out.println("Root 1 and Root 2 are null");
			return true;
		}
		
		if(root1== null || root2 == null) {
			return false;
		}
		
		return root1.value ==root2.value && isIdentical(root1.left, root2.right) && isIdentical(root1.right, root2.left);
	}
	
	public static void main(String[] args) {
		
		BinarySubTree  sb = new BinarySubTree();
		Node root1 = new Node(20);
		root1.left = new Node(10);
		root1.right = new Node(5);
		sb.isIdentical(root1,root1 );
		
	}

}
