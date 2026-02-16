/****
 * Created by: Michael Connolly
 * Created on: 04/12/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
import java.io.*;

public class Lecture2challs {
   public static void main(String[] args) throws IOException{

      // CHAR STREAM
      BufferedReader inputStream = null;
      PrintWriter outputStream = null;

      try{
         inputStream = new BufferedReader(new FileReader("xanadu.txt"));
         outputStream = new PrintWriter(new FileWriter("stringOutput.txt"));

         String l;
         while((l = inputStream.readLine()) !=null){
            outputStream.write(l);
         }
      }finally {
         if(inputStream != null){
            inputStream.close();
         }
         if(outputStream != null){
            outputStream.close();
         }
      }

      // BYTE STREAM
//      FileInputStream in = null;
//      FileOutputStream out = null;
//
//      try{
//         in = new FileInputStream("xanadu.txt");
//         out = new FileOutputStream("outagain.txt");
//         int c;
//
//         while ((c = in.read()) !=-1){
//            out.write(c);
//         }
//      }finally {
//         if(in != null){
//            in.close();
//         }
//         if( out != null){
//            out.close();
//         }
//      }

   }//main
}//class
