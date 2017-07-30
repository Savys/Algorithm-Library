//package com.sriram.tree;
package com.savitha.trie;
public class TrieTester {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Trie t = new Trie();

		t.addWord(t.getRootNode(),"Her");
		t.addWord(t.getRootNode(),"Here");
		t.addWord(t.getRootNode(),"Cat");
		t.addWord(t.getRootNode(),"Category");
		t.printTree();

	}
}
