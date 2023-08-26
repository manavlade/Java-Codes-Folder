// class prac{
//     private int id;
//     private String name;
//     private String employeename;
//     public void setId(int id) {
//         this.id = id;
//     }public int getId() {
//         return id;
//     }

//    public void setName(String name) {
//        this.name = name;
//    }
//     public int getname(){
//         return name;
//     }

//     public void setEmployeename(String employeename) {
//         this.employeename = employeename;
//     }
//     public String getemployeename(){
//         return employeename;
//     }
// }

// public class THIS{
//     public static void main(String[] args) {
//         prac JK = new prac();
//         prac.setemployeename("MANAV");
//         prac.setname("GOOGLE");
//         prac.setid(98);
//         System.out.println(get.name);
//         System.out.println(get.id);
//         System.out.println(get.employeename);

//     }
// }

// Write a Java program to sort a numeric array and a string array
// int[] num = new int[10];
// num[0] = 78;
// num[1] = 99;
// num[2] = 89;
// num[3] = 45;
// num[4] = 90;
// Arrays.sort(num); *****EASY METHOD TO SORT ARRAY BY USING LIBRARY DIRECTLY***** 
// System.out.println(Arrays.toString(num));
// System.out.println("Array elemnts are");
// for(int i = 0; i<10; i++)
// {
// System.out.println(num[i]);
// }
// for (int j = 0; j < num.length; j++) {
//     if (num[j] < num[j + 1]) {
//         System.out.println(num[j + 1]);
//     } else {
//         System.out.println(num[j + 1]);
//     }
// }
// Write a Java program to sum values of an array.
// 
        // int[] sum = new int[5];
        // sum[0] = 98;
        // sum[1] = 918;
        // sum[2] = 198;
        // sum[3] = 88;
        // int total = 0;
        // for (int i = 0; i < sum.length; i++) {
        //      total = total + sum[i];
        //     System.out.println(total);
        // }
        // System.out.print("THE SUM OF ARRAY ELEMENT IS: " + total);
//  ******************COMPLETED SUCCESSFULLY*************
// Write a Java program to print the following grid
//       int[][] a = new int[10][10];
// for (int i = 0; i < 10; i++) {
//     for (int j = 0; j < 10; j++) {
//         System.out.printf("%2d ", a[i][j]);
//     }
//     System.out.println();
// }
//     }
// }
//   Write a Java program to calculate the average value of array elements
import java.util.*;
import java.util.Arrays;
public class THIS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to calculate the average value of array elements");
        int [] avg = new int[7];
        System.out.println("Enter array elemnts");
        for(int i = 0; i< avg.length; i++){
            avg[i] = sc.nextInt();
        }
        System.out.println("ARRAY ELEMNTS ARE");
        for(int j = 0; j<avg.length; j++){
            System.out.println(avg[j]);
        }
        System.out.println("THE AVERAGE VALUE OF ARRAY ELEMENTS ARE");
        int sum = 0;
        for (int k = 0; k < avg.length; k++) {
            sum = sum + avg[k];
        }
        int  average = sum / 3;
        System.out.println(average);
        System.out.println("THE SORTED ARRAY IN ASCENDING ORDER IS: ");
        Arrays.sort(avg);
        System.out.println(Arrays.toString(avg));
        System.out.println("THE SORTED ARRAY IN DECENDING ORDER IS: ");
        Arrays.sort(avg, Collections.reverseOrder());
        // System.out.println(Arrays.toString(avg));
    }
}
// COMPILED SUCCESSFULLY