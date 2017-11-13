package com.savitha.tree.SimpleTreewithoutGen;



public class NodeTester1 {
  public static void main(String[] args) {
    Node universe=new Node("Universes");
    Node mars=universe.addChild("Marss");
    Node earth=universe.addChild("Earths");
    
    Node asia=earth.addChild("Asias");
    Node india=asia.addChild("Indias");
    Node tn=india.addChild("TNs");
    Node chennai=tn.addChild("Chennais");
    
    Node northAmerica = earth.addChild("NorthAmericas");
    Node  unitedStates = northAmerica.addChild("UnitedStatess");
    Node  california = unitedStates.addChild("Californias");
    Node  fremont = california.addChild("Fremonts");
    Node  towhee = fremont.addChild("Towhees");

   Node china = asia.addChild("Chinas");
   Node S1 = china.addChild("ChinaState1s");
   Node S2 = china.addChild("ChinaState2s");
   
    universe.remove("Earths");

    universe.print();
   }

 }
