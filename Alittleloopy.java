/* 
   Class: Application Programming 1
   Assignment: A Little Loopy
   Name: Eric Ratcliff
   Date: 3/13/25
*/

import java.util.Scanner;

class Alittleloopy {

    public static void main(String[] args) {
    
        // Count from -10 to 0 by 1
        
        System.out.println("Count from -10 to 0 by 1");
        
        int i = -10;
        
        while (i <= 0) {
        
            System.out.print(i + " ");
            
            i++;
            
        }

        // New line for spacing
        
        System.out.println("\n");

        // Count from 1 to 20 by 3 with commas
        
        System.out.println("Count from 1 to 20 by 3 with commas");
        
        int j = 1;
        
        System.out.print(j);
        
        j += 3;
        
        while (j <= 20) {
        
            System.out.print(", " + j);
            
            j += 3;
            
        }

        // New line for spacing
        
        System.out.println("\n");

        // Ask the user to input a number and loop until they guess 99
        
        System.out.println("Enter 99 to stop:");
        
        Scanner myScanner = new Scanner(System.in);
        
        int guess;
        
        int count = 0; // Counter for total attempts

        do {
        
            System.out.print("Enter a number between 1 and 100: ");
            
            guess = myScanner.nextInt();
            
            if (guess != 99) {
            
                count++;
            }
            
        } while (guess != 99);

        System.out.println("You entered a wrong number " + count + " times.");
        
        myScanner.close();
        
    }
}