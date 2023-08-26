
import java.util.regex.Pattern;
import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.DimensionUIResource;
import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;

/*class square{
    int side;
    int l;
    int b;
    public int area(){
    return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public int rectanglearea (){
        return l*b;
    }
    public int rectangleperimeter(){
        return 4*(l+b);
    }
    class tommy {
        public void run() {
            System.out.println("HE STARTS RUNNING");  
        }
        public void fire() {
            System.out.println("HE STARTS FIRING");
        }
        public void hit() {
            System.out.println("HE STARTS HITTING");
            
        }
    }
   
}
*/
// *************DIFFERENT CODE************
/*
 * public class PRACTICE_CLASS{
 * static void multiplication(int N) {
 * for(int I = 1; I<=10; I++)
 * {
 * System.out.format("%d X %d = %d\n", N, I, N * I);
 * }
 * }
 * static void Pattern(int M) {
 * for(int i = 0; i< M; i++)
 * {
 * for(int j = 0; j<i+1; j++)
 * {
 * System.out.print("&");
 * }
 * System.out.println();
 * }
 * }
 * static int recursion(int k){
 * if(k == 1){
 * return 1;
 * }
 * 
 * return k + recursion(k-1);
 * 
 * }
 * // *************DIFFERENT CODE************
 * public static void main(String[] args) {
 * // square nice = new square();
 * //nice.side = 45;
 * //System.out.println(nice.area());
 * //System.out.println(nice.perimeter());
 * //square slice = new square();
 * //slice.l = 48;
 * //slice.b = 74;
 * //System.out.println( slice.rectanglearea());
 * //System.out.println(slice.rectangleperimeter());
 * // practice set q5;
 * prac my = new prac();
 * my.a = 98;
 * my.b = 99;
 * System.out.println(my.add());
 * //multiplication(78971561);
 * //Pattern(2);
 * //recursion(54);
 * System.out.println(recursion(4));
 * }
 * }
 */
/* 
// **********************************DIFFERENT CODE*****************************
 WAYS TO DEFINING ARRAYS
  1. TYPE
  int [] sql = new int [90];
  2. TYPE
  int [] sql
  sql = new int [90];
  3. TYPE
  int [] sql = {10, 52, 45 , 98};
 */
/* 
public class PRACTICE_CLASS{
    public static void main(String[] args) {
        System.out.println("BACK TO PROGRAMMING");
        Scanner Nice = new Scanner(System.in);
        int [] DATA = new int[10];
        DATA[0] = 10;
        DATA[1] = 50;
        DATA[2] = 100;
        for(int i = 0; i<= DATA.length; i++)
        {
            
          // System.out.println("ENTER THE DATA TO BE ENTERED IN ARRAY");

        }
    }
}*/

// **********************************DIFFERENT CODE*****************************
// BELOW CODE IS FOR ACCESS MODIFIERS
/* 
 class cylinder{
    private int radius;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;   
    }
    public double volume() {
        return Math.PI * radius * radius * height;      
    }
    public double CircleArea() {
        return 2 * Math.PI * radius;
        
    }
}
class rectangle
{
    private int length;
    private int breadth;
    private int ice;
    public void setIce(int ice) {
        this.ice = ice;
    }
    public int getIce() {
        return ice;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    
    public double Area() {
        return length* breadth;
    }
    public double volume() {
        return length*breadth*ice;
        
    }
    
}
public class PRACTICE_CLASS{
    public static void main(String[] args) {
     /*    cylinder mice = new cylinder();
        rectangle choice = new rectangle();
        mice.setHeight(45);
        System.out.println(mice.getHeight());
        mice.setRadius(98);
        System.out.println(mice.getRadius());
      System.out.println(mice.surfaceArea());
      System.out.println(mice.volume());
      System.out.println(mice.CircleArea());
      choice.setBreadth(89);
      System.out.println(choice.getBreadth());
      choice.setIce(978);
      System.out.println(choice.getIce());
      choice.setLength(97);
      System.out.println(choice.getLength());
      System.out.println(choice.Area());
      System.out.println(choice.volume());
*/
// **********************************DIFFERENT CODE*****************************
// BELOW CODE IS FOR INHERITANCE
/*class Animal {
    public void printMe() {
        System.out.println("HEY THIS IS ANIMAL CLASS");
    }
}

class Lion extends Animal {
    public void PrintMe1() {
        System.out.println("I AM LION ");
    }
}

public class PRACTICE_CLASS{
public static void main(String[] args) {
    
//Animal MY = new Animal();
    // MY.printMe();
    // MY.PrintMe1();
    Lion King = new Lion();
    King.PrintMe1();
    King.printMe();
 }
}
*/
// **********************************DIFFERENT CODE*****************************
// BELOW CODE IS FOR USING THIS AND SUPER KEYWORD ALSO IT IS CONTINUATION OF INHERITANCE
/*class Base{
    Base()                     // BHAI YE EK CONSTRUCTOR HAI
    {
        System.out.println("HELLO I AM A CONSTRUCTOR");
    }
    Base(int X) //-> YE VALA    // BHAI YE EK OVERLOADED CONDTRUCTOR KYUKI ISME EXTRA INT HAI NAM SAME HAI BUS EXTRA VALUE AATA HAI
    {
        System.out.println("I AM A OVERLOADED CONSTRUCTOR AS " + X);
    }
}
class Derived extends Base{
    Derived(){                                                                                
        //super(10); // Isko use karte hai taaki hum overloaded CONSTRUCTOR KO CALL KAR SAKE 
        System.out.println("I AM DERIVED CLASS COSNTRUCTOR");
    }
    Derived(int X, int Y){
        super(X);
        System.out.println("I AM DERIVED CLASS OVERLOADED CONSTRUCTOR as " + Y);
    }
}
class LEARN extends Derived{
    LEARN(){
        System.out.println("I AM LEARN CONSTRUCTOR");
    }
    LEARN(int X, int Y, int Z){
        super(X, Y);
        System.out.println("I AM DOUBLE OVERLOADED CONSTRUCTOR " + Z);
}
}
public class PRACTICE_CLASS{
    public static void main(String[] args) {
       // Derived d = new Derived(99,89);
        LEARN V = new LEARN( 99,98, 97);
        System.out.println("NICE");
        
    }
}
*/
// **********************************DIFFERENT CODE*****************************
// BELOW CODE IS FOR METHOD OVERRRIDING 
// class NEW{
//    public void nice() 
//    {
//    System.out.println("I AM A METHOD OF CLASS NEW"); 
//    }
//    public void METH() {
//     System.out.println("I AM ABOUT TO BE OVERIDED");
//    }
// }
// class MNEW extends NEW{
//     @Override
//     public void METH() {
//         System.out.println("GUYS I AM OVERRIDED");
//     }
//     public void METH2() {
//       System.out.println("I AM METHID OF MNEW");  
//     }
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         System.out.println("HELLO WORLD");
//         NEW M = new NEW();
//         M.METH();

//         MNEW t = new MNEW();
//         t.METH();
//     }
// }
// **********************************DIFFERENT CODE*****************************
// CODE ON DYNAMIC METHOD DISPATCH
// class ONE{
//     public void nice() {
//         System.out.println("I AM A NICE CLASS");
//     }
//     public void Mice() {
//         System.out.println("I AM MICE CLASS");
//     }
// }
// class TWO extends ONE{
//     public void nice() {
//         System.out.println("I AM OVERRIDED FUNCTION OF TWO");
//     }
//     public void on() {
//         System.out.println("GOOD MORNNG");
//     }
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         ONE M = new TWO(); // Two object hai 
//         M.nice();
//         M.on(); // Allowed nahi hai. jiska method banaya hai usme hai aur agar super class mei nahi hai to nahi chalega 
//     }
// }
// **********************************DIFFERENT CODE*****************************
// abstract  class Abs{
//     Abs(){
//         System.out.println("HELLO I AM A CONSTRUCTOR");
//     }
//      public void name() {
//         System.out.println("I AM A ABSTRACT CLASS");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }
// class Tps extends Abs{
//     public void greet() {
//         System.out.println("HELLO GUYS");
//     }
//     public void greet2() {
//         System.out.println("HELLO GUYS GOOD MORNING");
//     }
// }
// abstract class Fps extends Abs{
//      public void name1() {
//         System.out.println("HELLO GUYS");
//     }
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//        Tps B = new Tps();
//         B.greet();
//         B.greet2();
//     }
// }

// **********************************DIFFERENT CODE*****************************
// Code on Interfaces 
// Isko thoda practice karna padega 
//  interface camera{
//     void snap();
//     void recordvideo();
//    default void recordvideo4k(){
//       System.out.println("Recording in 4k");
//     }
// }
// interface wifi{
//     String [] serachnetworks();
//     void connect(String network);
// }
// class phone{
//     public void hi() {
//         System.out.println("HELLO");
//     }
// }
// class smartphone extends phone implements camera, wifi{
// public void nice() {
//     System.out.println("WORLD");
// }
//  public void snap() {
//     System.out.println("Take a Snapshot");
//  }
//  public void recordvideo() {
//     System.out.println("Record a video");
//  }
//  // Agar isko comment out kiya to ye vala call hoga default vala call nhi hoga
// //  public void recordvideo4k() {
// //      System.out.println("Record a video in 4k form");
// //  }
//  public String [] serachnetworks() {
//     System.out.println("Searching Networks.....");
//     System.out.println("Available networks are.....");
//     String [] networklist = {"New","tplink","nice"};
//     return networklist;
//  }
 
//  public void connect(String network) {
//      System.out.println("Connecting to " + network);
//  }
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         smartphone m = new smartphone();
//         m.snap();
//         m.recordvideo();
//         m.nice();
//         m.hi();
//         m.serachnetworks();
//         String [] ar = m.serachnetworks();
//         for (String item : ar) {
//             System.out.println(item);
//         }
//         m.recordvideo4k();
//       //  m.connect();
//     }
// }
// **********************************DIFFERENT CODE*****************************
// Inheritance in interfaces
// interface myclass{
//     void meth1();
//     void meth2();
// }
// interface myclass2 extends myclass{
//     void meth3();
//     void meth4();
// }
// class MEthod implements myclass2{
//     public void meth1() {
//         System.out.println("Bro we can extend same methods");
//     }
//     public void meth2(){
//         System.out.println("Like we can extend same classes same interfaces");
//     }
    
//     public void meth3() {
//         System.out.println("Practice abstract class once");
//     }
    
//     public void meth4() {
//         System.out.println("YOU CAN DO IT JUST PRACTICE");
//     }
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         System.out.println("CODE ON INHERITANCE IN INTERFACE");
//         MEthod c = new MEthod();
//         c.meth1();
//         c.meth2();
//         c.meth3();
//         c.meth4();
//     }
// }
// **********************************DIFFERENT CODE*****************************
// class nice extends Thread{
//     public void run() {
//         int i = 0;
//         while(i<200){
//         System.out.println("I AM FIRST THREAD");
//         System.out.println("NICE");
//         i++;
//     }
// }
// }
// class GOOD extends Thread{
//  public void run(){
//         int i =0;
//         while(i<200){
//             System.out.println("My Cooking Thread is Running");
//             System.out.println("I am happy!");
//             i++;
//         }
//     }
// }

// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         nice n = new nice();
//         GOOD m = new GOOD();
//         n.start();
//         m.start();
//     }
// }
// **********************************DIFFERENT CODE*****************************
// Code for java thread
// class nice extends Thread{
//     public void run() {
//         System.out.println("HELLO WORLD");
//         System.out.println("nice");
//     }
// }
// class nice1 extends Thread{

//     public void run() {
//         int i = 0;
//     while(i <=10){
//             System.out.println("HELLO GUYS");
//         }
//     }
//     }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         nice t = new nice();
//         nice1 y = new nice1();
//         t.start();
//         y.start();
//     }
// }
// **********************************DIFFERENT CODE*****************************
// PRACTICE SET
// class thread extends Thread{
//     public void run() {
//         // while(true){
//         // }
//         System.out.println("GOOD MORNING");
// }
// }
// class nice extends Thread{
//     public void run() {
//         // while(true){
//         // }
//         System.out.println("GOOD NICE PRACTICE");
// }
// }

// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         thread t = new thread();
//         nice n = new nice();
//          System.out.println(t.getState());
//         t.setPriority(7);
//         n.setPriority(4);
//         System.out.println(t.getPriority());
//         System.out.println(n.getPriority());
//         t.start();
//         n.start();
//         // System.out.println(t.getState());
//         System.out.println(Thread.currentThread());

// }
// }
// **********************************DIFFERENT CODE*****************************
// TRY AND CATCH EXCEPTION IN JAVA

// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         int a = 80;
//         int b = 0;
//         try{
//             int c = a/b;
//         }
//         catch(Exception e){
//             System.out.println("THE REASON FOR EXCEPTION IS:");
//             System.out.println(e);
//         }

//     }
// }
// DIFFERENT EXCEPTION TYPES
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int [] num = new int[5];
//         num[0] = 45;
//         num[1] = 90;
//         num[2] = 99;
//         System.out.println("enter the index of array");
//         int b = sc.nextInt();
//       //  System.out.println("Enter the number to be divided with");
//       //  int c = sc.nextInt();
//         boolean bol = true;
//         while(bol){
//         try{
//            // System.out.println("THE ARRAY INDEX ENTERED BY YOU IS:");
//             System.out.println(num[b]);
//             bol = false;
//             //System.out.println("THE DIVIDED NUMBER IS:");
//            // System.out.println(num[b]/c);
//         }
//         // catch(ArithmeticException e){
//         //     System.out.println("ARITHMETIC EXCEPTION OCCURED");
//         //     System.out.println(e);
//        // }
//         catch(ArrayIndexOutOfBoundsException ex){
//             System.out.println("YOU HAVE EXCEEDED THE NUMBER OF ELEMENTS OF ARRAY");
//             System.out.println(ex);
//         }
//         // catch(Exception exe){
//         //     System.out.println("SOME EXCEPTION OCCURED");
//         // }
//     }
//     }
// }
// *********************THROW*****************
// class nive extends Exception{
//     public String toString() {
//         System.out.println("STRING EXCEPTION");
//     }
//     public String getMessage() {
//         System.out.println("bvghcxdzdgxcv");
//     }
    
// }
// public class PRACTICE_CLASS{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a<4){
//             try{
//                 throw new nive();
//             }
//             catch (Exception e){
//                 System.out.println("wromg");
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//             }
//         }
//     }
// }
// login page in React? **********************************
// **************THROW AND THROWS**************
class fire extends Exception{
    public String toString() {
        return "I AM CREATED CLASS";
    }
    public String getMessage() {
        return "I AM MESSAGE GIVEN";
    }
}
public class PRACTICE_CLASS{
    public static int  div(int a, int b) throws ArithmeticException {
        int c = a/b;
        return c;
    }
    public static double area(int r) throws fire {
        if(r<0){
            throw new fire();
        }
        double y = Math.PI * r * r;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    try{
        int duv = div(99, 10);
        System.out.println(duv);
        double nic = area(-1);
        System.out.println(nic);
    }
    catch (Exception e){
        System.out.println("EXCEPTION");
    }


    }
}










