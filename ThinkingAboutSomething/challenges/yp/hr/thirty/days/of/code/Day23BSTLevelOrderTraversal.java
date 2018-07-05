package yp.hr.thirty.days.of.code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {
	
	static void levelOrder(NodeBST root){
		Queue<NodeBST> queue = new LinkedList<NodeBST>();
	      queue.add(root);
	      while(queue.peek()!=null)
	          {
	    	  NodeBST node =queue.remove();
	          System.out.print(""+node.data+" ");
	          if(node.left!=null)
	              queue.add(node.left);
	          if(node.right!=null)
	              queue.add(node.right);
	      }
	      
	    }

	public static NodeBST insert(NodeBST root,int data){
        if(root==null){
            return new NodeBST(data);
        }
        else{
        	NodeBST cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter how many number your using to find order in BST");
            int T=sc.nextInt();
            NodeBST root=null;
            while(T-->0){
            	System.out.println("Please enter "+(T+1)+"value");
                int data=sc.nextInt();
                root=insert(root,data);
            }
            sc.close();
            levelOrder(root);
        }	
}


class NodeBST{
	NodeBST left,right;
    int data;
    NodeBST(int data){
        this.data=data;
        left=right=null;
    }
}
