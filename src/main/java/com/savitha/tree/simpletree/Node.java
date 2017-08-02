package com.savitha.tree.simpletree;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {
  private E value;
  private  Node<E> parent;
  private List<Node<E>>children;
  
  public Node(E value)
  {
    setValue(value);
    children=new ArrayList<Node<E>>();
  }
  public E getValue()
  {
    return value;
  }
  public void setValue(E value){
    this.value = value;
  }
  public Node<E> getParent()
  {
    return parent;
    
  }
  private void setParent(Node<E> parent) {
    this.parent = parent;
  }
  public List<Node<E>>  getChildren()
  {
    return this.children;
  }
  private void setChildren(List<Node<E>>children)
  {
    this.children=children;
  }
  private   Node<E>addChild(Node<E> newNode){
    children.add(newNode);
    newNode.setParent(this);
    return newNode;
    
  }
  Node<E>addChild(E value){
    Node<E> newNode=new Node<E>(value);
    addChild(newNode);
    return newNode;
  }
  public Boolean remove(E value) {
    Boolean isRemoved = false;
    for(int i=0;i<children.size();i++) {
      Node<E> child = children.get(i);
      if(child.equals(value)) {
        isRemoved = remove(child);
        break;
      }
    }
    return isRemoved;
  }

  private Boolean remove(Node<E> childNode) {
    Boolean isRemoved = children.remove(childNode);
    if(isRemoved) {
      childNode.setParent(null);
    }
    return isRemoved;
  }

  public Boolean hasChild() {
    return !children.isEmpty();
  }
  public void print() {
    print("");
    
  }private void print(String prefixSpaces) {
    System.out.println(prefixSpaces + "──" + this.getValue());
    for (int i = 0; i < children.size() ; i++) {
        children.get(i).print(prefixSpaces +  "│   ");
    }
}

}
