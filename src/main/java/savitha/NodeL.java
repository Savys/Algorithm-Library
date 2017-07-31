package savitha;

public class NodeL {
      public int data;
      public NodeL next;
      
      public NodeL(Integer data){
        this.data=data;
      }
      public NodeL(Integer data,NodeL lastNode){
        if(lastNode != null) {
          lastNode.next = this;
        }
        this.data=data;
        
      }
}
