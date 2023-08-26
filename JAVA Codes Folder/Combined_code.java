import java.util.Scanner;
class INHERI{
   public void NICE() {
    System.out.println("I AM A CONSTRUCTOR AND I AM ABOUT TO INHERIT");
   }
}
    class INHERITANCE extends INHERI{
       public void MICE() {
        System.out.println("I AM INHERITED");
       }
    }
    class One{
        public void name() {
            System.out.println("I AM NAME CLASS");
        }
        public static void MI() {
            System.out.println("I AM A MI CLASS");
        }
    }
    class Two extends One{
        public void name() {
            System.out.println(" I AM NAME CLASS OF EXTENDED CLASS");
        }
        public void on() {
            System.out.println("I AM A ON CLASS OF EXTENDED");
        }
    }
public class Combined_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE FOLLOWING INFO FOR APPROPRIATE OPERATION");
System.out.println("1 TO CHECK IF NUMBER IS EVEN");
System.out.println("2 TO CHECK IF NUMBER IS ODD ");
System.out.println("3 TO CALCULATE SUM OF EVEN NUMBERS");
System.out.println("4 TO CALCULATE SUM OF ODD NUMBERS");
System.out.println("5 TO GET MULTIPLICATION TABLE");
System.out.println("6 TO GET MULTIPLICATION TABLE IN REVERSE ORDER");
System.out.println("7 TO GET INHERITANCE");
System.out.println("8 TO GET TO KNOW ABOUT SUPER CLASS AND INHERITANCE");
System.out.println("9 TO GET TO KNOW ABOUT METHOD OVERRIDING");
System.out.println("10 TO GET TO KNOW ABOUT ACCESS MODIFIERS");
int CASE = sc.nextInt();

             switch (CASE) {

                 case 1:
                     System.out.println("PLEASE ENTER THE NUMBER");

                     int Y = sc.nextInt();
                     if(Y%2 == 0)
                     {
                        System.out.println("NUMBER IS EVEN");
                     }
                     else
                     {
                     System.out.println("SORRY NUMBER IS NOT EVEN");
                     }
                     System.out.println("THIS IS THE ANSWER");
                     break;
                     

                 case 2:
                     System.out.println(" PLEASE ENTER THE NUMBER");

                     float M = sc.nextFloat();;
                     if(M%2 !=0)
                     {
                        System.out.println("NUMBER IS ODD");
                     }
                     else    
                     {
                        System.out.println("NUMBER IS NOT ODD");
                     }                
                      System.out.println("THIS IS THE ANSWER");
                     break;
                    

                 case 3:
                     System.out.println(" PLEASE ENTER THE NUMBER");
                    
                      int sum = 0;
                      int S = sc.nextInt();
                      for(int i = 0; i<S; i++)
                      {
                        sum = sum + (2*i);
                      }
                      System.out.println(sum);
                       System.out.println("THIS IS THE ANSWER");
                      break;
                
                    case 4:
                     System.out.println(" PLEASE ENTER THE NUMBER");
                    int K = sc.nextInt();
                    int addition = 0;
                    for(int Z = 0; Z<K; Z++)
                    {
                        addition = addition + (Z);
                    }
                    System.out.println(addition);
                    System.out.println("THIS IS THE ANSWER");
                    break;

                 case 5:
                     System.out.println("PLEASE ENTER THE NUMBER ");

                    int Z = sc.nextInt();
                    for(int a= 1; a<=10; a++)
                    {
                        int Q = Z*a;
                        System.out.println(Q);
                    }
                    System.out.println("THIS IS THE ANSWER");
                     break;
                    

                 case 6:
                     System.out.println("PLEASE ENTER THE NUMBER ");

                     int E = sc.nextInt();
                     for(int R = 10; R>=1; R--)
                     {
                        int REV = E*R;
                        System.out.println(REV);
                     }
                    System.out.println("THIS IS THE ANSWER");
                     break;

                 case 7:
                     System.out.println("THIS CODE IS ABOUT INHERITANCE");
                    INHERITANCE MINI = new INHERITANCE();
                    MINI.NICE();
                    MINI.MICE();
                    System.out.println("INHERITANCE IS ALL ABOUT EXTENDING A CLASS");
                    break;
                case 8:
                System.out.println("ONE IS SUPER CLASS AND TWO IS SUB CLASS");
                One MY = new Two();
                
               
               
                  default:
                     System.out.println("PLEASE ENTER PROPER VALUE");

             }
             System.out.println("THANK YOU VERY MUCH FOR USING MY CODE");

         

     
    }
}

    

