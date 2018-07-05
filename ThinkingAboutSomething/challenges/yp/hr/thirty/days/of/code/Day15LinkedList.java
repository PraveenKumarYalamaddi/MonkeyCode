package yp.hr.thirty.days.of.code;

import java.util.Scanner;

/** @About This.Class
 * 
 * Linked list is a Data structure which consists of a group of nodes which represents a sequence together
 * 
 **/


class Node{
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Day15LinkedList {

	public static Node insert(Node head, int data) {
		Node n = new Node(data);
		if(head ==null) {
			head = n;
			return head;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next =n;
		//System.out.println("Head data: " + head.data + " Head next: " + head.next);
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		System.out.println("Enter number of elements you want to insert");
		int N = sc.nextInt();
		while (N-- > 0) {
			System.out.println("Enter " + (N+1) + " Element");
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}
