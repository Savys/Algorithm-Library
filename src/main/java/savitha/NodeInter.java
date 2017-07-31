package savitha;

import java.util.List;

public interface NodeInter<T> {
  public Object getElement();
  public void setElement(Object element);
  public NodeInter getParent();
  public void setParent(NodeInter parent);
  public List<NodeInter> getChildren();
  public void addChild(NodeInter child);
  public void removeChild(NodeInter child);

}
