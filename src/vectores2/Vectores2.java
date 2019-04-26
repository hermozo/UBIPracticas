package vectores2;

import static java.lang.System.in;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores2 {

    public static void main(String[] args) {

        // VERIFICAR SI DOS VECTORES SONS IGUALES 
        System.out.println(" +++++++++++ VERIFICAR SI DOS VECTORES SONS IGUALES +++++++++++ ");
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        System.out.println("elementos de vector 1 : ");
        vector1 = Vectores2.cargarVector(vector1);
        System.out.println("elementos de vector 2 : ");
        vector2 = Vectores2.cargarVector(vector2);
        if (Vectores2.compararvectores(vector1, vector2)) {
            System.out.println("SON IGUALES");
        } else {
            System.out.println("SON DISTINTOS");
        }
        // INVERTIR UN VECTOR 
        System.out.println("+++++++++++  INVERTIR UN VECTOR +++++++++++ ");
        int[] vector3 = new int[5];
        System.out.println("CARGAR VECTOR ");
        vector3 = Vectores2.cargarVector(vector3);
        System.out.println("MOSTRAR VECTOR ");
        mostrar(vector3);
        System.out.println("");
        vector3 = Vectores2.invertirVector(vector3);
        System.out.println("VECTOR INVERTIDO");
        mostrar(vector3);
    }

    public static int[] invertirVector(int[] x) {
        int f = 0;
        int[] vectoraux = new int[x.length];
        for (int i = (x.length - 1); i >= 0; i--) {
            vectoraux[f] = x[i];
            f++;
        }
        return vectoraux;
    }

    public static boolean compararvectores(int[] x, int[] y) {
        if (x.length == y.length) {
            for (int i = 0; i <= (y.length - 1); i++) {
                if (x[i] != y[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static int[] cargarVector(int[] vector) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= (vector.length - 1); i++) {
            System.out.print("Ingresar dato =>  ");
            vector[i] = leer.nextInt();
        }
        return vector;
    }

    public static void mostrar(int[] vector) {
        for (int i = 0; i <= (vector.length - 1); i++) {
            System.out.print(vector[i] + ", ");
        }
    }

    private static int rand(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

}
