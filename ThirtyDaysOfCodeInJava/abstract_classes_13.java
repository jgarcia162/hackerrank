/* Abstract Classes Day 13 - https://www.hackerrank.com/challenges/30-abstract-classes?h_r=next-challenge&h_v=zen
Task
Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these  parameters:
string title
string author
int price
Implements the Book class' abstract display() method so it prints these  lines:
Title:, a space, and then the current instance's Title.
Author:, a space, and then the current instance's Author.
Price:, a space, and then the current instance's Price.

*/
import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}


class MyBook extends Book{
    String title;
    String author;
    int price;
    
    public MyBook(String title, String author, int price){
        super(title,author);
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    @Override
    void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}