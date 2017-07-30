//package com.sriram.tree;
package com.savitha.trie;

public class NodeTester {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Node<String> universe = new Node<String>("Universe");
		Node<String> mars = universe.addChild("Mars");
		Node<String> earth = universe.addChild("Earth");


		Node<String> asia = earth.addChild("Asia");
		Node<String> india = asia.addChild("India");
		Node<String> tn = india.addChild("TN");
		Node<String> chennai = tn.addChild("Chennai");

		Node<String> northAmerica = earth.addChild("NorthAmerica");
		Node<String> unitedStates = northAmerica.addChild("UnitedStates");
		Node<String> california = unitedStates.addChild("California");
		Node<String> fremont = california.addChild("Fremont");
		Node<String> towhee = fremont.addChild("Towhee");

		Node<String> china = asia.addChild("China");
		Node<String> S1 = china.addChild("ChinaState1");
		Node<String> S2 = china.addChild("ChinaState2");

		universe.print();
	}

}
