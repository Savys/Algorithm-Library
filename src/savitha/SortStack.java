package savitha;

import java.util.ArrayList;
import java.util.Stack;

public class SortStack<T> {
  private ArrayList<T> stack1 = new ArrayList<T> ();
  private ArrayList<T> stack2 = new ArrayList<T> ();
  private int top = 0;
  private int top2 = 0;
  public int size () { return top; }
  
  public static void main(String[] args) {
    SortStack<Integer> st1=new SortStack<Integer>();
    SortStack<Integer> st2=new SortStack<Integer>();
    st1.push(5);
    st1.push(4);
    st1.push(6);
    st1.push(8);
    st1.push(10);
    st1.push(12);
    
    for(int j=0;j<6;j++){
    int i = st1.pop ();
    System.out.println(i);
    st2.pushtoHelper(i);
    while (!st2.isempty())
    {
        System.err.println(st2.pop());
    }
    }
  }
  

  

  private boolean isempty() {
    return top2 == 0;
   
  }

  private  void pushtoHelper(T ele) {
   stack2.add(top2++,ele);
   if(ele<stack2[top])
   {
     pop
   }    
  }

  private int pop() {
      return (int) stack1.remove (--top);
  }

  private void push(T item) {
  stack1.add(top++,item);
 }

}
