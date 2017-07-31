package com.savitha.oops.equals;


public class Node {
    public Integer data;
    public Node next;
    
    public Node(Integer data)
    {
      this.data=data;
      //this.next = next;
    }

    
    public Node(Integer data,Node lastNode)
    {
      if(lastNode != null) {
        lastNode.next = this;
      }
      this.data=data;
      //this.next = next;
    }

}
