package HackerRank;

import java.util.HashSet;

public class SinglyLinkedList {

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}

	Node head;
	SinglyLinkedList(){
	head=null;	
	}
	
	public void add(int data){
		if(head==null){
			head=new Node(data);
		}
		else{
			Node headPt = head;
			while(head.next!=null){
				head=head.next;
			}
			head.next=new Node(data);
			head=headPt;
		}
	}
	
	public void deleteDuplicates(){
		HashSet<Integer> set = new HashSet<>();
		Node prev = head;
		set.add(prev.data);
		Node curr = prev.next;
		while(curr.next!=null){
			if(set.contains(curr.data)){
				prev.next=curr.next;
			}
			else{
				set.add(curr.data);
				prev=prev.next;
			}
			curr=curr.next;
		}
	}
	
	public void print(){
		if(head==null){
			return;
		}
		Node headPt = head;
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		head=headPt;
	}
	
	public static void main(String...args){
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(6);
		list.print();
		list.deleteDuplicates();
		list.print();
	}
}
