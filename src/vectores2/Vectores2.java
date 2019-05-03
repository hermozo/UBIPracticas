package vectores2;

import static java.lang.System.in;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores2 {

    public static int[] generarVector(int[] vector) {
        int c = 5;
        for (int i = 0; i <= (vector.length - 1); i++) {
            vector[i] = c;
            c = c + 5;
        }
        return vector;
    }

    public static void muestramyor(int[] vect2) {
        int t = 0, c = 0;
        for (int i = 0; i < vect2.length; i++) {
            t = t + vect2[i];
            c++;
        }
        double r = t / c;
        for (int i = 0; i < vect2.length; i++) {
            if (vect2[i] > r) {
                System.out.println(vect2[i] + " - ");
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(" +++++++++++ GENERAR MULTIPLOS DE 5 +++++++++++ ");
        int[] vect1 = new int[5];
        vect1 = generarVector(vect1);
        mostrar(vect1);
        System.out.println();
        System.out.println(" +++++++++++ HALLAR EL PROMEDIO DE UN VECTOR Y  CONTAR CUANTOS ELEMENTOS SON MAYOR QUE EL PRIMERO +++++++++++ ");
        int[] vect2 = new int[5];
        vect2 = cargarVector(vect2);
        muestramyor(vect2);
        System.out.println();
        System.out.println(" +++++++++++ HALLAR EL MAYOR Y LA POSION DONDE SE ENCUENTRA +++++++++++ ");
        
        
        System.out.println();
        System.out.println(" +++++++++++ HALLAR LA X Y LA POSICION DONDE SE ENCUENTRA +++++++++++ ");
        System.out.println();
        System.out.println(" +++++++++++ ORDENAR DESENDENETEMENTE +++++++++++ ");

         System.out.println(" +++++++++++ SUMAR DOS VECTORES +++++++++++ ");
        int[] a1 = new int[3];
        int[] b1 = new int[3];
        System.out.println(" CARGAR VECTOR 1 ");
        a1 = cargarVector(a1);
        System.out.println(" CARGAR VECTOR 2 ");
        b1 = cargarVector(b1);
        int[] resp = sumar(a1, b1);
        mostrar(resp);

        System.out.println(" +++++++++++SERIE DE FIBONASI+++++++++++ ");
        int[] fx = seriefibo(10);
        mostrar(fx);
		
        System.out.println(" +++++++++++Mayor de un numero+++++++++++ ");
        int[] mayor = new int[5];
        mayor = cargarVector(mayor);
        int mayorx = mayornum(mayor);
        System.out.println(" El mayor es " + mayorx);

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

        // ORDENAR UN VECTOR 
        System.out.println("+++++++++++  ORDENAR UN VECTOR  +++++++++++ ");
        int[] a = new int[5];
        a = ordenarVector(cargarVector(a));
        mostrar(a);

        // BUSCAR EN UN VECTOR 
        System.out.println("+++++++++++ BUSCAR EN UN VECTOR  +++++++++++ ");
        int[] vector5 = new int[5];
        vector5 = cargarVector(vector5);
        Scanner leer = new Scanner(System.in);
        System.out.println("QUE ELEMENTO DECEAS BUSCAR");
        int buscar = leer.nextInt();
        String resps = buscarElemento(vector5, buscar);
        System.out.println(resps);
    }

    public static int[] sumar(int[] a, int[] b) {
        int[] resp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resp[i] = a[i] + b[i];
        }
        return resp;
    }

    public static int[] seriefibo(int max) {
        int xx = -1;
        int xxx = 1;
        int[] fibo = new int[max];
        for (int i = 0; i < max; i++) {
            int y = (xxx + xx);
            xx = xxx;
            xxx = y;
            fibo[i] = y;
        }
        return fibo;
    }

    public static int mayornum(int[] mayor) {
        int ix = mayor[0];
        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i] > ix) {
                ix = mayor[i];
            }
        }
        return ix;
    }

    public static String buscarElemento(int[] vector5, int buscar) {
        for (int i = 0; i <= vector5.length - 1; i++) {
            if (vector5[i] == buscar) {
                return "EL ELEMENTO EXISTE";
            }
        }
        return "NO SE ENCONTRO EL ELEMENTO";
    }

    public static int[] ordenarVector(int[] a) {
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    aux = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = aux;
                }
            }
        }
        return a;
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
