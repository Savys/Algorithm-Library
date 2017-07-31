package com.savitha.hackerrank;

import java.util.Scanner;

public abstract class Book {
  String title;

  public String getTitle() {
    return title;
  }

  abstract void setTitle(String s);

  public class MyBook extends Book {
    @Override
    void setTitle(String s) {
      this.setTitle(s);
    }
  }

  public class Main {
    public void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String title = sc.nextLine();
      MyBook new_novel = new MyBook();
      new_novel.setTitle(title);
      System.out.println("The title is: " + new_novel.getTitle());
    }
  }
}
