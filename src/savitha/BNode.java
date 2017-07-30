package savitha;

public class BNode {
  int key;
  String name;
  BNode leftChild;
  BNode rightChild;
  
  
  BNode(int key,String name ){
    this.key=key;
    this.name=name;
   }
  public String toString()
  {
    return name + " has the key " +key;
  }
}
