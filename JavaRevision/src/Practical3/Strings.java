package Practical3;

/****
 * Created by: Michael Connolly
 * Created on: 14/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Strings {
   public static void main(String[] args) {

      String sentence1 = "abc";
      String sentence2 = "abc";
      String sentence3 = "a";
      String sentence4 = "a" + "bc";
      String sentence5 = sentence3 + "bc";
      String sentence6 = "xyz";
      String sentence7 = sentence5.intern();

      System.out.println("sentence 1 == Sentence 2 = " + (sentence1==sentence2));
      System.out.println("Sentence 1 == Sentence 3 = " + (sentence1==sentence3));
      System.out.println("Sentence 1 == Sentence 4 = " + (sentence1==sentence4));
      System.out.println("Sentence 4 = " + sentence4);

      System.out.println("Sentence 1 == Sentence 5 = " + (sentence1==sentence5));
      System.out.println("Sentence 1 == Sentence 6 = " + (sentence1==sentence6));
      System.out.println("Sentence 1 == Sentence 7 = " + (sentence1==sentence7));
   }//main
}//class
