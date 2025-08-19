package poo;

//clase secundaria
import java.util.Scanner;

public class acciones {

    //atributos (caracteristicas)
    int na, nb;
    int a[] = new int[21];
    int b[] = new int[21];
    int c[] = new int[21];

    //método 1 (procesos)
    public void lectura() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo A");
        na = leer.nextInt();
        System.out.println("Lectura de los elementos del array");
        for (int i = 1; i <= na; i++) {
            System.out.println("posición #" + i + " ");
            a[i] = leer.nextInt();
        }
        System.out.println("Ingrese el tamaño del arreglo A");
        nb = leer.nextInt();
        System.out.println("Lectura de los elementos del array");
        for (int i = 1; i <= nb; i++) {
            System.out.println("posición #" + i + " ");
            b[i] = leer.nextInt();
        }

    }

    //método 2 (procesos)
    public void interseccion() {

    }

    //método 3 (procesos)
    public void union() {
        int i;
        for (i = 1; i <= na; i++) {
            c[i] = a[i];
        }
        for (i = 1; i <= nb; i++) {
            c[i + na] = b[i];
        }
    }

    //método 4 (procesos)
    public void complemento() {

    }

    //método 5 (procesos)
    public void escritura1() {
        System.out.println("El vector resultante es ");
        for (int i = 1; i <= na; i++) {
            if (i == 1) {
                System.out.print("[ " + a[i]);
            } else {
                if (i < na) {
                    System.out.print(" " + a[i]);
                } else {
                    System.out.print(" " + a[i] + " ]");
                }
            }
        }
        System.out.println("El vector resultante es ");
        for (int i = 1; i <= nb; i++) {
            if (i == 1) {
                System.out.print("[ " + b[i]);
            } else if (i < na) {
                System.out.print(" " + b[i]);
            } else {
                System.out.print(" " + b[i] + " ]");
            }
        }
    }

    public void escritura2() {
        for (int i = 1; i <= na + nb; i++) {
            if (i == 1) {
                System.out.print("[ " + c[i]);
            } else if (i < na + nb) {
                System.out.print(" " + c[i]);
            } else {
                System.out.print(" " + c[i] + " ]");
            }
        }
    }

    public void escritura3() {

    }

    public void producto_punto() {
        int resultado = 0;

        if (na == nb) {
            for (int i = 1; i <= na; i++) {
                resultado += a[i]*b[i];
            }
            System.out.println("El resultado es: "+resultado);
        }
    }
    public void rotar(){
        
    }
}
