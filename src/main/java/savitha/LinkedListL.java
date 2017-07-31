    package savitha;
    
    
    
    public class LinkedListL {
      private NodeL head=null;
    
      public void append(int ele )
      {
        NodeL head=null;
        NodeL current=head;
        if(head ==null)
        {
          head.next=new NodeL(ele);
        }
        while(current.next !=null){
          current=current.next;
        }
        current.next=new NodeL(ele);
      }
      
      public void prepend(int  ele){
        NodeL newNode=new NodeL(ele);
        newNode.next=head;
        head=newNode;
        
      }
      public void deleteWithValue(int ele)
      {
        if (head ==null)
        {
          return;
        }
        if(head.data == ele)
        {
          head=head.next;
        }
        NodeL current=head;
        while(current.next !=null)
        {
          if(current.next.data ==ele)
          {
            current.next=current.next.next;return;
          }
          current=current.next;
        }
   
      }
      public void print()
      {
        NodeL current=head;
        while(current !=null)
        {
          System.out.println("->"+current.data);
          current=current.next;
          
        }
      }
      public static void main()
      {
        LinkedListL linkedlist= new LinkedListL();
        linkedlist.prepend(1);
        linkedlist.append(2);
       linkedlist.append(3);
       linkedlist.append(4);
       linkedlist.print();
      }
    }
