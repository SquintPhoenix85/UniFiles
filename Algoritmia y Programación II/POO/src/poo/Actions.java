
package poo;

import java.util.Scanner;

/**
 *
 * @author orarroyo
 */
public class Actions {
    int na, nb;
    int[] a = new int[na];
    int[] b = new int[na];
    
    public void read () {
       Scanner read = new Scanner(System.in);
       System.out.print("Write the size of the array A: ");
       na = read.nextInt();
       for (int i = 0; i < na; i++) {
           System.out.print("Write the value to go in position "+i+": ");
           a[i] = read.nextInt();
       }
       System.out.print("Write the size of the array B: ");
       nb = read.nextInt();
       for (int i = 0; i < nb; i++) {
           System.out.print("Write the value to go in position "+i+": ");
           b[i] = read.nextInt();
       }
    }
    
    public int[] intersect(int[] a, int[] b) {
        int[] c = new int[na];
        if (a.length == b.length) {
            for (int i = 0; i < na; i++) {
                for (int j = 0; j < na; j++) {
                    if (a[i] == b[j]) {
                        c[j] = a[i];
                    }
                }
            }
        }
        return c;
    }
    
    public void join() {
        
    }
    
    public void complement() {
        
    }
    public void write() {
        
    }
}
