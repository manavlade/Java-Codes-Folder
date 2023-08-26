import java.util.Scanner;
public class LAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enetr yout name");
        char NAME = sc.next().charAt(0);
        System.out.println("enter your employee number");
        int M = sc.nextInt();
        System.out.println("enter your salary");
        float S = sc.nextFloat();
        //da = sa*12/100
        float DA = (S*12)/100;
System.out.println(DA);


        
    }
}
