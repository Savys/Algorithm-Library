package com.savitha.algos;

public class ListNode {
        ListNode      next;
        protected int data;
      
        /* Constructor */
        public ListNode() {
          next = null;
          data = 0;
        }
      
        /* Constructor */
        public ListNode(int d) {
      
          this.data = d;
          // this.next=n;
        }
      
        public ListNode getNext() {
          return next;
        }
      
        public int getData() {
          return data;
        }
      
        public void setNext(ListNode next) {
          this.next = next;
        }
      
        public void setData(int d) {
          this.data = d;
        }

}
