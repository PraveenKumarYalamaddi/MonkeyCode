package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day24MoreLinkedLists {
	
	public static NodeMLL removeDuplicates(NodeMLL head) {
		NodeMLL currentNode = head;
	       while(currentNode!=null && currentNode.next!=null)
	           {
	    	   NodeMLL node = currentNode;
	           while(node.next!=null)
	               {
	               if(node.next.data==currentNode.data)
	                   {
	            	   NodeMLL next = node.next.next;
	            	   NodeMLL temp= node.next;
	                   node.next=next;
	                   temp=null;

	               }
	               else{
	               node=node.next;
	               }
	           }
	           currentNode=currentNode.next;
	       }
		return head;

	    }

	public static NodeMLL insert(NodeMLL head, int data) {
		NodeMLL p = new NodeMLL(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeMLL start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(NodeMLL head) {
		NodeMLL start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeMLL head = null;
		System.out.println("Please enter how many values you want to insert");
		int T = sc.nextInt();
		while (T-- > 0) {
			System.out.println("Enter "+(T+1)+" value");
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		head = removeDuplicates(head);
		display(head);

	}

}

class NodeMLL {
	int data;
	NodeMLL next;

	NodeMLL(int d) {
		data = d;
		next = null;
	}
	

}
