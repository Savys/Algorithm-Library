/* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 push(x) – Push element x onto stack.
 pop() – Removes the element on top of the stack.
 top() – Get the top element.
 getMin() – Retrieve the minimum element in the stack.
 
 Note that all the operations have to be constant time operations.
 
 Questions to ask the interviewer :
 
 Q: What should getMin() do on empty stack ? 
 A: In this case, return -1.
 
 Q: What should pop do on empty stack ? 
 A: In this case, nothing. 
 
 Q: What should top() do on empty stack ?
 A: In this case, return -1
 NOTE : If you are using your own declared global variables, make sure to clear them out in the constructor.
 */
package com.savitha.array;

import java.util.Stack;

public class StackMinimum {
  Stack<Integer> minStack = new Stack<Integer>();
  Stack<Integer> stack = new Stack<Integer>();
  public StackMinimum()
  {
    stack = new Stack<>();
    minStack = new Stack<>();
  }
  public void push(int x) {
    stack.push(x);    
    if(minStack.isEmpty() || x <= minStack.peek())
        minStack.push(x);
}
  public void pop() {        
    if(!stack.isEmpty())
    {
        int num = stack.pop();
        if(num == minStack.peek())
            minStack.pop();
    }
    
}
  public int top() {
    if(stack.isEmpty())
        return -1;
    return stack.peek();
}
  public int getMin() {
    if(minStack.isEmpty())
        return -1;
    return minStack.peek();
}
  
  public static void main(String[] args) {
    //2,4,5,3,1
    StackMinimum sm=new StackMinimum();
    sm.push(2);
    sm.push(4);
    sm.push(5);
    sm.push(3);
    sm.push(1);
    
    int min=sm.getMin();
    System.out.println(min);
    sm.pop();
    min=sm.getMin();
    System.out.println(min);
  }

}
