
// import java.util.Scanner;
// public class Practice
// {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//        int a = 10;
//          int b = 45;
//          int c = 78;
//          int sum = a+b+c;
//          System.out.println(sum);
//         Scanner sc = new Scanner(System.in);
//          int M = sc.nextInt();
//          System.out.println(M);
//          float Y = sc.nextFloat();
//          System.out.println(Y);
//          System.out.println("ENTER ANY TWO NUMBERS");
//          int B = sc.nextInt();
//          System.out.println("you have entered");
//          System.out.println(B);
//          int W = sc.nextInt();
//          System.out.println("SECOND NUMBER ENTERED BY YOU IS:");
//          System.out.println(W);
//          int Sum = B+W;
//          System.out.println("THE ADDITION OF TWO NUMBERS IS ");
//          System.out.println(Sum);
//          Boolean E = sc.hasNextInt();
//          System.out.println(E);
//          System.out.println("ENTER NUMBER");
//          boolean Q = sc.hasNextFloat();
//          System.out.println(Q);
//        //  int X = sc.nextInt();
//         // int Y = sc.nextInt();
//         // int SLOPE = X-Y ;
//       //   int Final = SLOPE / 2;
//       //   System.out.println(Final);
//     }
// }

// RECURSION IN JAVA
public class Practice{
//  public static void name(int n, int i, int sum) {
  // if(i == n){
  //   sum += i;
  //   System.out.println(sum);
  //   return;
  // }
  // sum += i;
  // name(n, i + 1, sum);

 public static long name(Long n) {
  if(n == 1 || n == 0){
    return 1;
  }
 long f = name(n-1);
 long t = n * f;
 return t;
 }
  public static void main(String[] args) {
    System.out.println("ENTER ANY NUMBER");
  //  int h = name(10);
  //   System.out.println(h);
  long t1 = 20;
  long h = name(t1);
  System.out.println(h);
  }
} 
