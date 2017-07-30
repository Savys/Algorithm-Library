//package com.sriram.tree;
package com.savitha.trie;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {
	private E value;
	private Node<E> parent;
	private List<Node<E>> children;

	public Node(E value) {
		setValue(value);
		children = new ArrayList<Node<E>>();
	}

	public E getValue() {
		return value;
	}

	public List<Node<E>> getChildren() {
		return this.children;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getParent() {
		return parent;
	}

	private void setParent(Node<E> parent) {
		this.parent = parent;
	}

	private void setChildren(List<Node<E>> children) {
		this.children = children;
	}

	private Node<E> addChild(Node<E> newNode) {
		children.add(newNode);
		newNode.setParent(this);
		return newNode;
	}

	Node<E> addChild(E value) {
		Node<E> newNode = new Node<E>(value);
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

	public Node<E> getNodeInChildren(E e) {
		Node<E> node=null;
		for(int i=0;i<this.children.size();i++) {
			Node<E> currentNode = this.children.get(i);
			if(currentNode.getValue().equals(e)) {
				node=currentNode;
				break;
			}
		}
		return node;
	}

	public Boolean findNodeInChildren(E e) {
		Boolean found=false;
		for(int i=0;i<this.children.size();i++) {
			Node<E> node = this.children.get(i);
			if(node.getValue().equals(e)) {
				found=true;
				break;
			}
		}
		return found;
	}

	public Long getChildHierchyCount () {
		long count = 0;
		if(this.hasChild()) {
			count++;
		}
		long maxCount=0;
		for(int i=0;i<children.size();i++) {
			Node<E> child = children.get(i);
			Long childCount = child.getChildHierchyCount();
			if(maxCount < childCount) {
				maxCount = childCount;
			}
		}
		return count += maxCount;
	}

	public void print() {
		print("");
	}


	private void print(String prefixSpaces) {
        System.out.println(prefixSpaces + "──" + this.getValue());
        for (int i = 0; i < children.size() ; i++) {
            children.get(i).print(prefixSpaces +  "│   ");
        }
    }

	private void print2(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + this.getValue());
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).print2(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .print2(prefix + (isTail ?"    " : "│   "), true);
        }
    }

}
