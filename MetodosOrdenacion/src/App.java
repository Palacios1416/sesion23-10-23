import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("Cuantos valores va a ingresar?");
        int cant = scan.nextInt();
        int Arreglo[] = new int[cant];
        
        System.out.println("Ingrese los valores a ordenar");
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = scan.nextInt(); 
        }
        
        System.out.println("Desordenado");
        MostrarElements(Arreglo, Arreglo.length);
        OrdenPorInsercion(Arreglo, Arreglo.length);
        System.out.println("Ordenado");
        MostrarElements(Arreglo, Arreglo.length);
        
    }

    public static void OrdenPorInsercion(int A[], int n){
            for (int i = 1; i < n; i++) {
                int valorC = A[i]; //variable temporal
                int posicion = i; //pivote

                while (posicion > 0 && A[posicion - 1] > valorC) {
                    A[posicion] = A[posicion - 1];
                    posicion = posicion - 1;
                }
                A[posicion] = valorC;
            }
        }

        public static void MostrarElements(int A[], int n){
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
                
            }
            System.out.println();
        }
}
