import java.io.Serial;
import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicToolTipUI;
public class RockScissorgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALID CHOICE BETWEEN 0 TO 2");
        System.out.println("ENTER 0 FOR ROCK");
        System.out.println("ENTER 1 FOR SCISSOR");
        System.out.println("ENTER 2 FOR PAPPER");
        int userinput = sc.nextInt();
        Random RAM = new Random();
        int rom = RAM.nextInt(3);
       // {
         //   System.out.println("BHAI KYA KAR RAHA HAI KYU FUKAT UNGLI");
            
        //}
        if(userinput <= 2){
        if(userinput == rom)
        {
            System.out.println("THIS IS A DRAW");
        }
        else if (userinput == 0 && rom == 1 || userinput == 1 && rom == 2 || userinput == 2 && rom == 0 ) 
        {
         System.out.println("CONGRATULATIONS YOU WON");   
        } 
        else {
            System.out.println("YEAH I WON BETTER LUCK NEXT TIME USER");
            
        }
        if(userinput >2){
        System.out.println("BHAI KYU FUKAT MASTI ");
        }
    }
}
}

