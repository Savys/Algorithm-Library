package savitha;

//public interface BinaryTreeNode<E> {
public interface BinaryTreeNode {
  void findKey (int key);
  addNode();

/*  void setData(E data);/* Modifies the data stored in this node.*/
  void setRight(BinaryTreeNode<E> child);
  void setLeft(BinaryTreeNode<E> child);


  E     getData(); /*  Returns the data stored in this node.*/
  BinaryTreeNode<E> getParent();
  BinaryTreeNode<E> getRight();
  BinaryTreeNode<E> getLeft();
  
  void removeFromParent();
  
  public interface Visitor {
    <E> void visit(BinaryTreeNode<E> node);
  }
  void traversePreorder(Visitor visitor);
  void traversePostorder(Visitor visitor);
  void traverseInorder(Visitor visitor);


   
}
