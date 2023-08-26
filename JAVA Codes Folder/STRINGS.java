import java.util.Scanner;
public class STRINGS {
   public static void main(String[] args) {
Scanner SP = new Scanner(System.in);
//int A = SP.nextInt();
//System.out.println(A);
String Amazon = "Nice";
System.out.println(Amazon);
int value = Amazon.length();
System.out.println(value);
String Messi = Amazon. toUpperCase();
System.out.println(Messi);
String Mess = Amazon.toLowerCase();
System.out.println(Mess);
String BMC = "        MICROSOFT         ";
System.out.println(BMC);
int  Mes = BMC.length();
System.out.println(Mes);
String Me = BMC.trim();
System.out.println(Me); 
int VALUE = Me.length();
System.out.println(VALUE);
String Ronaldo = " MICROSOFT";
String MY = Ronaldo.substring(2,5);
System.out.println(MY);
String Ronaldos = " MICROSOFT";
String R = Ronaldos.replace('R', 'T');
//Boolean WAD = Ronaldos.startsWith(MIC);
//Boolean QAD = Ronaldos.endsWith(SOFR);
//System.out.println(R);
//System.out.println(WAD);
//System.out.println(QAD);
//int KAP = Ronaldos.indexOf(CRO);
//System.out.println(KAP);
int A = SP.nextInt();
int B = SP.nextInt();
if (A>120 && B>400) {
    System.out.println("GOOD");
    
} else {
    System.out.println("VERY GOOD");
}
if (A>200 || B>490) {
    System.out.println("NICE");
    
} else {
    System.out.println("VERY NICE");
    
}
   }
}
