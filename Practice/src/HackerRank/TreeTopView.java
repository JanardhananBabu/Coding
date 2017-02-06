package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTopView {
	/*
	   class Node 
	       int data;
	       Node left;
	       Node right;
	*/
	class Qitem{
	   Node node;
	   int hd;//hd - horizontal distance
	   Qitem(Node node, int hd){
	       this.node=node;
	       this.hd=hd;
	   } 
	}

	void top_view(Node root)
	{
	    Queue<Qitem> list = new LinkedList<Qitem>();
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    if(root!=null)
	        list.add(new Qitem(root,0));
	     else
	        return;
	     HashSet<Integer> set = new HashSet<Integer>();
	     while(!list.isEmpty()){
	         Qitem curr = list.poll();
	         if(!set.contains(curr.hd)){
	             set.add(curr.hd);
	             result.add(curr.node.data);
	         }
	         if(curr.node.left!=null){
	             list.add(new Qitem(curr.node.left,curr.hd-1));
	         }
	         if(curr.node.right!=null){
	             list.add(new Qitem(curr.node.right,curr.hd+1));
	         }   
	     }
	      for(int i=0;i<result.size();i++){
	          System.out.print(result.get(i)+" ");
	      }  
	}

}
