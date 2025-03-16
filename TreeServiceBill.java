/* Class: Application Programming 1
   Project: Program 2 (Tree Service Bill)
   Name: Eric ratcliff
   Date: 2/16/25
*/

import java.util.Scanner;

// Get different values

class TreeServiceBill{
   public static void main(String[] args) {
      double hours = 0;
      final int rate = 75;
      double cost = 0;
      
      Scanner myScanner = new Scanner(System.in);
      
      // Get the input
      
      System.out.print("Enter the total hours workded: ");
      hours = myScanner.nextDouble();
      System.out.println();   
      
      cost = hours * rate;
      
      // Print the result
      
      System.out.printf("%.2f hours worked\n", hours);
      System.out.printf("Hourly rate: %d\n", rate);
      System.out.printf("Total bill: $%.2f\n", cost);
     
   }
}