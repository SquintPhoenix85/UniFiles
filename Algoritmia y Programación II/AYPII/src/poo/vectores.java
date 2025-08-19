
package poo;

import java.util.Scanner;


public class vectores {

    int vec[] = new int[21];
    int tam;

    public int[] lectura() {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba el tamaño del arreglo A: ");
        tam = read.nextInt();
        for (int i = 1; i <= tam; i++) {
            System.out.println("Escriba el valor de la posición " + i);
            vec[i] = read.nextInt();
        }
        return vec;
    }

    public int[] sumar() {
        int[] v = new int[21];
        return v;
    }

    public void escritura(int t, int[] v) {
        for (int i = 1; i <= t; i++) {
            if (i == 1) {
                System.out.println("[ " + v[i]);
            } else {
                if (i < t) {
                    System.out.println(" " + v[i]);
                } else {
                    System.out.println(" " + v[i] + " ]");
                }
            }
        }
    }
}
