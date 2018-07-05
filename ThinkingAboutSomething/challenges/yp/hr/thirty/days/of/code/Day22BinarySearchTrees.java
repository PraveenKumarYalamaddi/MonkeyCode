package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day22BinarySearchTrees {

	public static int getHeight(NodeUs root){
        int heightLeft = 0;
        int heightRight = 0;
        if(root.left != null){
            heightLeft = getHeight(root.left)+1;
        }
        if(root.right != null){
            heightRight = getHeight(root.right)+1;
        }
        return (heightLeft>heightRight ? heightLeft:heightRight);
    }
	
	public static NodeUs insert(NodeUs root,int data){
        if(root==null){
            return new NodeUs(data);
        }
        else{
        	NodeUs cur;
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
	
	public static void levelOrder(NodeUs root){
	      
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter how many values you want to insert in a node");
        int T=sc.nextInt();
        NodeUs root=null;
        while(T-->0){
        	System.out.println("Please enter the "+(T+1)+" value");
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
        sc.close();
	}
	
}


class NodeUs{
	NodeUs left,right;
    int data;
    NodeUs(int data){
        this.data=data;
        left=right=null;
    }
}
