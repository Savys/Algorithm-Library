//package com.sriram.tree;
package com.savitha.tree.trie;


public class Trie {
	Node<TrieData> root = new Node<TrieData>(new TrieData("root"));


	public Node<TrieData> getRootNode() {
		return root;
	}

	public void addTerminationNode(Node<TrieData> startNode) {
		startNode.addChild(new TrieData("\0"));
	}

	public void addWord(Node<TrieData> startNode, String word) {
		if(word.length() < 1 ) {
			return;
		}

		String currentElement = word.substring(0,1);
		String restWord = word.substring(1);

		Node<TrieData> foundNode = startNode.getNodeInChildren(new TrieData(currentElement));
		if(foundNode == null) {
			startNode = startNode.addChild(new TrieData(currentElement));
			addWord(startNode,restWord);
		}else {
			foundNode.getValue().count++;
			addWord(foundNode,restWord);
		}

		if(restWord.length() < 1) {
			addTerminationNode(startNode);
		}
	}



	public void printTree() {
		root.print();
	}
}
