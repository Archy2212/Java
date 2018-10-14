// File Name : DemoException.java
import java.io.*;

public class DemoException {

   public static void main(String args[]) {
      try {
         int a[] = new int[4];
         System.out.println("Access element three :" + a[4]);
      } catch (Exception e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}