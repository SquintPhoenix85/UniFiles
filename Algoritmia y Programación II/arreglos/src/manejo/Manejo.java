
package manejo;

import java.util.Scanner;

/**
 *
 * @author orarroyo
 */
public class Manejo {

    
    public static void main(String[] args) {
        // Create Scanner for System.in - Allows user input
        Scanner read = new Scanner(System.in);
        
        //Declaring relevant values - n for the number of values in the array, x for the numerical value of the position to eliminate
        System.out.print("Enter the array bound value (number of fields in the array): ");
        int n = read.nextInt();
        System.out.print("Enter the position value to erase (Starting with 0 to "+ (n-1) +" ): ");
        int x = read.nextInt();
        
        //Declaring the array with index amount n previously recorded
        int a[] = new int[n];
        
        //Prompting the user for the values of the array <a>
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for Position #"+i+": ");
            a[i] = read.nextInt();
        }
        
        //Checking if x is in array index
        if (x >= 1 && x <= n){
            //If check successful, overwrite values beginning with position x
            for (int i = x; i < n-1; i++){
                a[i] = a[i+1];
            }
            
            //Reducing the index value by one, since a position was erased
            n = n - 1;
            System.out.println("The process completed successfully. The output values are: ");
            //Printing the modified array
            for (int i = 0; i < n; i++){
                System.out.println("Position #"+i+": ");
                System.out.println(a[i]); 
            }
        } else {
            //Check failed; output error message to user
            System.out.println("La posición "+ x + " no existe.");
        }
    }
    
}

