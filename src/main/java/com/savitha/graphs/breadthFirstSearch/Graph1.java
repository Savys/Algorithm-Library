package com.savitha.graphs.breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class Graph1 {
    int[][] adjMatrix;
    int rootNode=0;
    int NNodes;
    
    boolean[]visited;
    
    public Graph1(int N) {
     adjMatrix = new int[N][N];
      visited=new boolean[N];
      NNodes = N;
    }
    Graph1(int[][] mat)
    {
       int i, j;

       NNodes = mat.length;

       adjMatrix = new int[NNodes][NNodes];
       visited = new boolean[NNodes];


       for ( i=0; i < NNodes; i++)
          for ( j=0; j < NNodes; j++)
             adjMatrix[i][j] = mat[i][j];
    }

    public void bfs()
    {
      int n,child;
      Queue<Integer>q=new LinkedList<Integer>();
      q.add(rootNode);
      
      visited[rootNode]=true;
      while(!q.isEmpty())
      {
       n= q.peek().intValue();
       child=getUnvisitedChildNode(n);
       if(child!=-1) 
       {
         visited[child]=true;
         printNode(child);
         q.add(child);
       }
       else
       {
         q.remove();//check here 
       }
      } 
      clearVisited();      //Clear visited property of nodes
    }
    private void clearVisited() {
      // TODO Auto-generated method stub
      
    }
    private void printNode(int n) {
      System.out.println(n);
      
    }
    private int  getUnvisitedChildNode(int n) {
      int j=0;
      for(j=0;j<NNodes;j++) {
        if(!visited[j]) {
          return (j);
        }
      }
      return (-1);
  }
}
