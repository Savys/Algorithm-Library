package com.savitha.datastructure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import com.savitha.StackInterface;


public class StackTest {
  protected StackInterface s;
  @Test
  public void testNewStackIsEmpty() {
    //A stack is empty on construction
      assertTrue(s.isEmpty());
      assertEquals(s.size(), 0);
  }
  
}
