
package poo;


public class POO {

    public static void main(String[] args) {
        int a [] = new int[21];
        int b [] = new int[21];
        int na, nb;
        
        
        /*acciones 
        acciones Arreglo = new acciones();
        Arreglo.lectura();
        Arreglo.escritura1();
        Arreglo.producto_punto();
        Arreglo.union();
        Arreglo.escritura2();
        */
        
        
        sort s = new sort();
        vectores vec = new vectores();
        a = vec.lectura();
        na = vec.tam;
        //b = vec.lectura();
        //nb = vec.tam;
        vec.escritura(na, a);
        a = s.bubble(a, na);
        vec.escritura(na, a);
        //vec.escritura(nb, b);
        /*System.out.println("El vector C es ");
        for (int i = 1; i <= na; i++) {
            if (i == 1) {
                System.out.println("[ "+a[i]);
            } else {
                if (i < na) {
                    System.out.println(" "+a[i]);
                } else { 
                    System.out.println(" "+a[i]+" ]");
                }
            }
        }*/
    }
}
