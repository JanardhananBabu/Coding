package HackerRank;

import java.util.HashMap;

public class LRUCache {

	//add elements when size < capacity
	//update elements
	//adding elements when size == capacity and removing least recently used element

	class Node{
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
		}
	}

	Node head;
	HashMap<Integer,Integer> map;
	int capacity;
	int size;

	LRUCache(int capacity){
		map = new HashMap<>();
		this.capacity=capacity;
		size=0;
	}

	public void put(int key, int value){
		if(size<capacity){
			if(!map.containsKey(key)){
				if(head==null)head=new Node(key);
				else{
					Node iter = head;
					while(iter.next!=null){
						iter=iter.next;
					}
					iter.next=new Node(key);
				}
				map.put(key,value);
				size++;
			}
			else{
				if(head.data!=key){
					Node prev = head;
					Node iter = head.next;
					while(iter!=null){
						if(iter.data==key){
							prev.next=iter.next;
							iter.next=head;
							head=iter;
							break;
						}
						iter=iter.next;
						prev=prev.next;
					}
				}
				map.put(key,value);
			}
		}
		else{
			if(!map.containsKey(key)){
				Node prev = head;
				Node iter = head.next;
				if(iter!=null)
					while(iter.next!=null){
						iter=iter.next;
						prev=prev.next;
					}
				prev.next=null;
				Node newHead = new Node(key);
				newHead.next=head;
				head=newHead;
				if(iter!=null)
					map.remove(iter.data);
			}
			else{
				if(head.data!=key){
					Node prev = head;
					Node iter = head.next;
					while(iter!=null){
						if(iter.data==key){
							prev.next=iter.next;
							iter.next=head;
							head=iter;
							break;
						}
						iter=iter.next;
						prev=prev.next;
					}
				}
			}
			map.put(key,value);
		}
	}

	public int get(int key){
		if(!map.containsKey(key)) return -1;
		else{
			if(head.data==key)
				return map.get(key);
			Node prev = head;
			Node iter = head.next;

			while(iter!=null){
				if(iter.data==key){
					prev.next=iter.next;
					iter.next=head;
					head=iter;
					break;
				}
				iter=iter.next;
				prev=prev.next;
			}
			return map.get(key);
		}
	}


}