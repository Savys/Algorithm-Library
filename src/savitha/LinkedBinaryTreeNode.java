package savitha;

public class LinkedBinaryTreeNode<E> implements BinaryTreeNode<E> {

  protected E                       data;
  protected LinkedBinaryTreeNode<E> parent;
  protected LinkedBinaryTreeNode<E> left;
  protected LinkedBinaryTreeNode<E> right;

  public LinkedBinaryTreeNode(E data) {
    this.data = data;
  }
/*
  @Override
  public void setData(E data) {
    this.data = data;
  }

  @Override
  public void setRight(BinaryTreeNode<E> child) {
  }

  @Override
  public void setLeft(BinaryTreeNode<E> child) {
  }

  @Override
  public E getData() {
    return data;
  }

  @Override
  public BinaryTreeNode<E> getParent() {
    return parent;
  }

  @Override
  public BinaryTreeNode<E> getRight() {
     return right;
  }

  @Override
  public BinaryTreeNode<E> getLeft() {
  return left;
  }

  @Override
  public void removeFromParent() {
  }

  @Override
  public void traversePreorder(savitha.BinaryTreeNode.Visitor visitor) {

  }

  @Override
  public void traversePostorder(savitha.BinaryTreeNode.Visitor visitor) {

  }

  @Override
  public void traverseInorder(savitha.BinaryTreeNode.Visitor visitor) {

  }

}
