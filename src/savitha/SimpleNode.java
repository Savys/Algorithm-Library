package savitha;

import java.util.ArrayList;
import java.util.List;

public class SimpleNode<T> implements NodeInter {
  private Object          element;
  private NodeInter       parent;
  private List<NodeInter<T>> children;

  public SimpleNode(Object element) {
    this.element = element;
    this.parent = null;
    this.children = new ArrayList<NodeInter>();
  }
  @Override
  public Object getElement() {
    return element;
  }
  @Override
  public void setElement(Object element) {
    this.element = element;
  }
  @Override
  public NodeInter<T> getParent() {
    return this.parent;
  }
  @Override
  public void setParent(NodeInter parent) {
    this.parent = parent;
  }
  @Override
  public List<NodeInter<T>> getChildren() {
    return this.children;
  }
  public void setChildren(List<NodeInter<T>> children){
    for(NodeInter<T>child:children)
      child.setParent(this);
    this.children= children;    
  }
  @Override
  public void addChild(NodeInter child) {
    child.setParent(this);
    children.add(child); //why  to maintain list of nodes/add
  }
  @Override
  public void removeChild(NodeInter child) {
    this.children.clear();
  }
}
