/****
 * Created by: Michael Connolly
 * Created on: 20/11/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
import javax.net.ssl.SSLEngine;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Lab1 {
//   public static  int Sum(int num1, int num2){
//      return num1+num2;
//   }
//   public static void square (double length){
//      System.out.println("Area: " + length*length + "\nPerimeter: " + length*4);
//   }
//   public static void rectangle (double length, double width){
//      System.out.println("Area: " + length*width + "\nPerimeter: " + (length*width)*2);
//   }
//   public static void triangle (double height, double base){
//      System.out.println("Area: " + height*base/2);
//   }
//   public static void circle (double radius){
//      System.out.println("Area: " + Math.PI*Math.pow(radius,2));
//   }
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      // Q10
      int digit1, digit2, digit3, digit4, num1, num2, num3, num4;
      int[] binary = {128, 64, 32, 6, 8, 4, 2, 1};
      System.out.print("Enter Digit 1 of binary code: ");
      digit1 = kb.nextInt();
      kb.nextLine();
      System.out.print("\nEnter Digit 2 of binary code: ");
      digit2 = kb.nextInt();
      kb.nextLine();
      System.out.print("\nEnter Digit 3 of binary code: ");
      digit3 = kb.nextInt();
      kb.nextLine();
      System.out.print("\nEnter Digit 4 of binary code: ");
      digit4 = kb.nextInt();
      kb.nextLine();

      if(digit1 == 0){
         num1 = binary[0];
      }
      else{
         num1 = binary[4];
      }
      if(digit2 == 0){
         num2 = binary[1];
      }
      else {
         num2 = binary[5];
      }
      if(digit3 == 0){
         num3 = binary[2];
      }
      else{
         num3 = binary[6];
      }
      if(digit4 == 0){
         num4 = binary[3];
      }
      else{
         num4 = binary[7];
      }
      System.out.println("Binary code entered equals: " + (num1+num2+num3+num4));





      // Q9
//      double length, height, width, base, radius;
//      int choice =0;
//      while(choice!=5) {
//         System.out.println("==== SHAPE CALCULATOR ====");
//         System.out.println("1. Square\n2. Rectangle\n3. Triangle\n4. Circle\n5. Exit");
//         System.out.print("Operation: ");
//         choice = kb.nextInt();
//         kb.nextLine();
//
//         switch(choice){
//            case 1:
//               System.out.println("Enter length: ");
//               length = kb.nextDouble();
//               kb.nextLine();
//               square(length);
//               break;
//            case 2:
//               System.out.println("Enter Length: ");
//               length = kb.nextDouble();
//               kb.nextLine();
//               System.out.println("Enter width: ");
//               width = kb.nextDouble();
//               kb.nextLine();
//               rectangle(length, width);
//               break;
//            case 3:
//               System.out.println("Enter height: ");
//               height = kb.nextDouble();
//               kb.nextLine();
//               System.out.println("Enter base: ");
//               base = kb.nextDouble();
//               kb.nextLine();
//               triangle(height, base);
//               break;
//            case 4:
//               System.out.println("Enter radius: ");
//               radius = kb.nextDouble();
//               kb.nextLine();
//               circle(radius);
//               break;
//            case 5:
//               System.out.println("Exiting..");
//               break;
//            default:
//               System.out.println("Invalid");
//         }
//      }



      // Q8
//      int input = 0;
//      double num1, num2;
//      boolean valid = true;
//
//
//         while (input != 5) {
//
//            System.out.println("\n==== CALCULATOR ====");
//            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\nChoice: ");
//
//            input = kb.nextInt();
//
//            System.out.println("num1: ");
//
//            num1 = kb.nextDouble();
//
//            System.out.println("num2: ");
//
//            num2 = kb.nextDouble();
//
//            switch (input) {
//               case 1:
//                  System.out.println(num1 + num2);
//                  break;
//               case 2:
//                  System.out.println(num1 - num2);
//                  break;
//               case 3:
//                  System.out.println(num1 * num2);
//                  break;
//               case 4:
//                  if(num2 == 0){
//                     System.out.println("Cannot divide by 0!!");
//                  }
//                  else {
//                     System.out.println(num1 / num2);
//                  }
//                  break;
//               default:
//                  System.out.println("Invalid");
//            }
//         }



      // Q7
//      class Person{
//         String name;
//         int age;
//
//         void introduce() {
//            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
//         }
//      }
//
//      Person person1 = new Person();
//      person1.name = "Alice";
//      person1.age = 30;
//      person1.introduce();
//      Person person2 = new Person();
//      person2.name = "Bob";
//      person2.age = 25;
//      person2.introduce();
//
//      System.out.println("Enter name: ");
//      Person person3 = new Person();
//      person3.name = kb.nextLine();
//      System.out.println("Enter age: ");
//      person3.age = kb.nextInt();
//      kb.nextLine();
//      person3.introduce();



      // Q6
//      System.out.println("Enter your name: ");
//      String name = kb.nextLine();
//      System.out.println("Hello " + name + "\n" + name.length() + "\n" + name.toUpperCase() + "\n" + name.toLowerCase());
//      char [] reverse = name.toCharArray();
//      int left = 0;
//      int right = reverse.length-1;
//      while(left < right){
//         char temp = reverse[left];
//         reverse[left] = reverse[right];
//         reverse[right] = temp;
//         left++;
//         right--;
//      }
//      for(int i = 0; i < reverse.length; i++){
//         System.out.print("Reverse: " + reverse[i]);
//      }


      // Q5
//      System.out.println("Enter num1: ");
//      int num1 = kb.nextInt();
//      kb.nextLine();
//      System.out.println("Enter num2: ");
//      int num2 = kb.nextInt();
//      kb.nextLine();
//      System.out.println(Sum(num1, num2));



      // Q4
//      int num = 1;
//      while(num <= 10){
//         System.out.println(num);
//         num++;
//      }
//      for(int i = 1; i <=10; i++){
//         System.out.println(i);
//      }
//      String [] fruit = {"Apple", "Banana", "Orange", "Grapes"};
//      for(int i = 0; i < fruit.length; i++){
//         System.out.print(fruit[i] + ", ");
//      }



      // Q3
//      int num;
//      System.out.println("Please enter number: ");
//      num = kb.nextInt();
//      kb.nextLine();
//      if(num % 2 == 0){
//         System.out.println("The number is even");
//      }
//      else {
//         System.out.println("The number is odd");
//      }


      //Q2
//      int a, b, sum, difference, product;
//      double quotient;
//      a = 10;
//      b = 5;
//      sum = a+b;  difference = a - b;  product = a*b; quotient = a/b;
//      System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient);



      // Q1
//      char fName = 'J';
//      String sName = "Smith";
//      int age = 25;
//      boolean isEmployed = true;
//      double salary = 21000;
//
//      if(isEmployed == true){
//
//      }
//
//      System.out.println(fName + sName + " is " + age + " years old, is currently " + isEmployed + " and has a salary of £" + salary);

   }//main
}//class
