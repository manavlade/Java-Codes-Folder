import java.util.Scanner;;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int money;
      //  int [][] flats;
      //  flats = new int [2][3];
        float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum / marks.length);
        int b = 99;
        int c = 87;
        int Sum = b+c;
        System.out.println(sum);
    }
}
