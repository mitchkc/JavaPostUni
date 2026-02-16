/****
 * Created by: Michael Connolly
 * Created on: 18/11/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Intro {
   public static void main(String[] args) {

//      for(int i = 0; i< args.length; i++){
//         System.out.println(args[i]);
//      }
//
//      int sum = sumRange(1,10);
//      System.out.println("Sum is: " + sum);

      char [] chars = new char[10];
      double [] list = {3.3, 9.0, 45.0, 6.5, 7.9};
      for(int i = 0; i < list.length; i++){
         System.out.println(list[i]);
      }
      System.out.println();
      for(int i = 0; i < list.length; i++){
         list[i] = list[i]*2;
         System.out.println(list[i]);
      }
      System.out.println();
      for(int i = list.length-1; i >= 0; i--){
         System.out.println(list[i]);
      }

   }//main

//   public static int sumRange(int s, int e){
//      int n = e - s + 1;
//      int sum = (n * (s + e)) / 2;
//      return sum;
//   }
}//class
