package yp.algo.deep.dive;

public class ReverserSingleLinkedList<T> {
	
	private Node<T> head;
	
	public void addElement(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding Elements");
		Node<T> temp = head;
		while(true) {
			if(temp == null) {
				head = nd;
				break;
			}else if (temp.getNextRef() == null){
				temp.setNextRef(nd);
				break;
			}else {
				temp = temp.getNextRef();
			}
		}
	}
	
	public void traverse() {
		Node<T> temp = head;
		while(true) {
			if(temp == null) {
				break;
			}
			System.out.println(temp.getValue()+"\t");
			temp = temp.getNextRef();
		}
		
	}
	
	public void reverse() {
		System.out.println("Reversing");
		Node<T> previous = null;
		Node<T> current = head;
		Node<T> next = null;
		
		while(current!=null) {
			next = current.getNextRef();
			current.setNextRef(previous);
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public static void main(String[] args) {
		
		ReverserSingleLinkedList<Integer> sl = new ReverserSingleLinkedList<Integer>(); 
		sl.addElement(3);
		sl.addElement(30);
		sl.addElement(13);
		sl.addElement(34);
		sl.addElement(113);
		sl.addElement(36);
		System.out.println();
		sl.traverse();
		System.out.println();
		sl.reverse();
		sl.traverse();
	}

}

class Node<T> implements Comparable<T>{

	private T value;
	private Node<T> nextRef;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> getNextRef(){
		return nextRef;
	}
	
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef ;
	}
	
	@Override
	public int compareTo(T args) {
		if(args == this.value) {
			return 0;
		}else {
		return 1;
		}
	}
	
}
