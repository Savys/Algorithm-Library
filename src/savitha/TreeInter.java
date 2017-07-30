package savitha;

public interface TreeInter<T> {
  public int size();
  public boolean isEmpty(NodeInter root);
  public void setRoot(NodeInter root);
  public NodeInter getRoot();
  public void insert(NodeInter parent, NodeInter child);
  public void remove(NodeInter node);
}
