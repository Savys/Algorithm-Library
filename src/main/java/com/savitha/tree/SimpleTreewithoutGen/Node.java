package com.savitha.tree.SimpleTreewithoutGen;

import java.util.ArrayList;
import java.util.List;

public class Node {

  private String     value;
  private Node       parent;
  private List<Node> children;

  public Node(String value) {
    setValue(value);
    children = new ArrayList<Node>();
  }

  public Object getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Node getParent() {
    return parent;

  }

  private void setParent(Node parent) {
    this.parent = parent;
  }

  public List<Node> getChildren() {
    return this.children;
  }

  private void setChildren(List<Node> children) {
    this.children = children;
  }
 
  private Node addChild(Node newNode) {
    children.add(newNode);
    newNode.setParent(this);
    return newNode;

  }

  Node addChild(String value) {
    Node newNode = new Node(value);
    addChild(newNode);
    return newNode;
  }

  public Boolean remove(String value) {
    Boolean isRemoved = false;
    for (int i = 0; i < children.size(); i++) {
      Node child = children.get(i);
      if (child.equals(value)) {
        isRemoved = remove(child);
        break;
      }
    }
    return isRemoved;
  }

  private Boolean remove(Node childNode) {
    Boolean isRemoved = children.remove(childNode);
    if (isRemoved) {
      childNode.setParent(null);
    }
    return isRemoved;
  }

  public Boolean hasChild() {
    return !children.isEmpty();
  }

  public void print() {
    print("");

  }

  private void print(String prefixSpaces) {
    System.out.println(prefixSpaces + "──" + this.getValue());
    for (int i = 0; i < children.size(); i++) {
      children.get(i).print(prefixSpaces + "│   ");
    }
  }

}
