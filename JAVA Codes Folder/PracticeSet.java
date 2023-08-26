import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import javax.tools.DocumentationTool.Location;

// Code to swap Numbers using 2 numvers


// public class prac {
//  public static void main(String args[])
//  {
//  int x, y;
//  System.out.println("Enter x and y");
//  Scanner in = new Scanner(System.in);
//  x = in.nextInt();
//  y = in.nextInt();
//  System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
//  x = x + y;
//  y = x - y;
//  x = x - y;
//  System.out.println("After Swapping\nx = "+x+"\ny = "+y);
//  System.out.println("ENTER 1 TO ADD SMALL NUMBERS AND ENTER 2 FOR ADDING HUGE NUMBERS");
//  int choice = in.nextInt();
// // int b = in.nextInt();
// // int g = in.nextInt();
// // int choice = in.nextInt();
//  switch(choice){
//     case 1:
//         int b = in.nextInt();
//         int g = in.nextInt();
//     System.out.println("YOUR ENTERED NUMBERS ARE"+ b + g);
//     int sum = b + g;
//     System.out.println(sum);
//     break;
//     case 2:
//     System.out.println("ENTER THE BIGGER NUMBERS AGAIN");
//     double v = in.nextDouble();
//     double m = in.nextDouble();
//     double num = v + m;
//     System.out.println(num);
//  }
//  }
// }
// *****************************DIFFERENT CODE***********************
// interface BasicAnimal{
//     void eat();
//     void sleep();
// }
// class Monkey{
//     public void jump() {
//        System.out.println("JUMPING......"); 
//     }
//     public void bite() {
//         System.out.println("BITE..........");
//     }
// }
// class Human extends Monkey implements BasicAnimal{
//     public void eat() {
//         System.out.println("I WANT TO EAT");
//     }
//     public void sleep() {
//         System.out.println("I GOING TO SLEEP");
//     }   
// }
// public class PracticeSet{
//     public static void main(String[] args) {
//         Human h = new Human();
//         h.jump();
//         h.bite();
//         h.eat();
//         h.sleep();
//         }
// }
// *****************************DIFFERENT CODE******************************
// Library Management code in java
// class Library{
//     String[] books;
//     int no_of_books;
//     Library(){
//         this.books = new String[100];
//         this.no_of_books = 0;
//     }
//    void addBooks(String book){
//         System.out.println("The book is been added");
//         this.books[no_of_books] = book;
//         no_of_books++;
//     }
//     void availableBooks(){
//         System.out.println("Available Books are");
//         for (String book : this.books) {
//             if(book == null){
//                 continue;
//             }
//             System.out.println("*" + book);
//         }
//     }
//     void issueBook(String book){
//         for(int i = 0; i< this.books.length; i++){
//             if(this.books[i].equals(book)){
//                 System.out.println("The Book is been issued");
//                 this.books[i] = null;
//                 return;
//             }
//             System.out.println("Book not available");
//         }
//     }
//     void returnBook(String book){
//         addBooks(book);
//     }
// }
// public class PracticeSet{
//     public static void main(String[] args) {
//         Library l = new Library();
//         l.addBooks("JAVA BY ORACLE");
//         l.addBooks("Data Structures");
//         l.addBooks("Algorithms");
//         l.availableBooks();
//         l.issueBook("Data Structures");
//         l.availableBooks();
//         l.returnBook("Data Structures");

//     }
// }
// Library Management Code
// 1) addbooks 2) viewbooks 3) issuebook 4) returnbook
// public class PracticeSet{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("WELCOME TO LIBRARY MANAGEMENT");
//         System.out.println("ENTER 1 TO ADD A BOOK");
//         System.out.println("ENTER 2 TO WITHDRAW A BOOK");
//         System.out.println("ENTER 3 TO SAERCH A BOOK");
//         System.out.println("ENTER 4 TO RETURN A BOOK");
//         System.out.println("PLEASE ENTER VALID OPTION");
//         int a = sc.nextInt();
//         switch(a) {
//             case 1:
//                     String books [] = new String [4];
//         System.out.println("ENTER NAME OF THE BOOK");
//         for(int i = 0; i< 4; i++){
//             books[i] = sc.nextLine();
//         }
//         System.out.println("you entered");
//         for(int i = 0; i< 4; i++){
//             System.out.println("books["+i+"] = " + books[i]);
//         }
//         case 2:
//         System.out.println("ENTER THE NAME OF THE BOOK YOU WANT");
//         String n = sc.nextLine();
//         if (n == books) {
            
//         } else {
            
//         }
//         }

// }
// }
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class PracticeSet {
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         if(N%2 == 0){
//             if(N <=5){
//               System.out.println("Not Weird");  
//             }
//             if(N>= 5 && N<=20){
//                 System.out.println(" Weird");   
//             }
//             else{
//                 System.out.println("Not Weird");
//             }
//         }
//         else{
//            System.out.println(" Weird"); 
//         }
//         scanner.close();
//     }
// }
// Hackerrank Problem
// import java.util.Scanner;

// public class PracticeSet {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//          double d = scan.nextDouble();
//          String s = scan.nextLine();
//         // Write your code here.

//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }
// Calculator Code
// import java.util.Scanner;
// class addition extends Exception{
//         public String toString(){
//             return "EXCEPTION LARGER INPUT THAN EXPECTED";
//         }
//         public String getMessage() {
//             return "EXCEPTION 'LARGER' INPUT THAN EXPECTED ";
//         }
//     }

// public class PracticeSet{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Welcome to calculator code ");
//         System.out.println("Enter proper inputs to perform proper operation on numbers");
//         System.out.println("Enter 1 for Addition");
//         System.out.println("Enter 2 for Subtraction");
//         System.out.println("Enter 3 for Multiplication");
//         System.out.println("Enter 4 for Divison");
//         System.out.println("Enter any two numbers");
//         int a = sc.nextInt();
//         int c = sc.nextInt();
//         int b = sc.nextInt();
//         switch(b){
//             case 1:
//            public static int addi(int v, int t) throws addition {
//           if(a <7000 || c <5000){
//             throw new addition();
//           }
//           int total = a + c;
//           System.out.println(total);
            
//            }
//         }


//     }
// }
//  import java.util.*;
// public class PracticeSet{
//     public static void main(String[] args) {
//         ArrayList<Integer> l1 = new ArrayList<>();
//         ArrayList<Integer> l2 = new ArrayList<>();
//         l2.add(8);
//         l2.add(7);
//         l2.add(9);
//         l2.add(5);

//         l1.add(45); 
//         l1.add(95);
//         l1.add(85);
//         l1.add(90);
//         l1.addLast(676);
//        // System.out.println(l1.addAll(l2));
//         System.out.println(l1.indexOf(l2));
//         System.out.println(l1.contains(5));
//         System.out.println(l1.equals(l2));
//         for(int i = 0; i<l1.size(); i++){
//             System.out.println(l1.get(i));
//         }
//     }
// }

// public class PracticeSet{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayDeque <Integer> a1 = new ArrayDeque<>();
//         // for(int i = 0; i< a1.size(); i++){}
//        //  a1.add(sc.nextInt());
//          a1.add(90);
//          a1.add(99);
//          a1.add(89);
//         System.out.println(a1.getFirst());
//         System.out.println( a1.getLast());

//     }
// }
 
// public class PracticeSet{
//     public static void main(String[] args) {
//         LocalDate d = LocalDate.now();
//         LocalDateTime r = LocalDateTime.now();
//         ///Location r1 = new Location();
//         System.out.println(r);
//     }
// }
// CALENDER CLASS IN JAVA
// public class PracticeSet{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC +5:30"));
//         System.out.println(c.getCalendarType());
//         System.out.println(c.getFirstDayOfWeek());
//         System.out.println(c.getWeekYear());
//         System.out.println(c.getTimeZone());
//     }
// }

// TIME.API IN JAVA
public class PracticeSet{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       String f = dt.format(df);
        System.out.println(f);
        
    }
}
