package savitha;

import java.util.List;

public  class SimpleTree<T> implements TreeInter {
  private NodeInter<T> root;
  public SimpleTree(NodeInter root) {
    this.root = root;
  }
   @Override
  public void setRoot(NodeInter root) {
    this.root = root;
  }
  @Override
  public NodeInter getRoot() {
      return root;
  }
  @Override
  public void insert(NodeInter parent, NodeInter child) {
    parent.addChild(child);
    child.setParent(parent);
  }
  @Override
  public void remove(NodeInter node) {
    while (!node.getChildren().isEmpty()) {
      remove(node.getChildren().get(0));
    }
  }
  @Override
  public boolean isEmpty(NodeInter root) {
    return root == null;
  }
  @Override
  public int size() {
    return getNumberOfDescendants(root) + 1;
  }
  private int getNumberOfDescendants(NodeInter<T> root2) {
    return 0;
  }





  
}
