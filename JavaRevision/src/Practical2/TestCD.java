package Practical2;
import java.text.DecimalFormat;

/****
 * Created by: Michael Connolly
 * Created on: 02/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class TestCD {
   public static void main(String[] args) {

      DecimalFormat df = new DecimalFormat("00.00");

      CD myCD = new CD("Bob Marley", "Legend", 1980, true);
      CD yourCD = new CD("Bonnie Raitt", "Nick of Time", 6.25, 11.99, 1989, true);

      myCD.printAllInfo();
      yourCD.printAllInfo();
      System.out.println("myCD was released: " + myCD.getYear() + "\n");
      yourCD.updatePrice(2.50);
      yourCD.printAllInfo();
      System.out.println("yourCD profit: £" + yourCD.getProfit());
   }//main
}//class
