package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de nodos: ");
        var=teclado.nextInt();
        
        for(int i=0;i<var;i++){
            System.out.println("Ingrese valor: ");
            valor=teclado.nextInt();
            abo.agregar(valor);
        }
        
        /*
        System.out.println(" Insertando los siguientes valores Randomicamente : ");
        for (int i = 1; i <= 10; i++) {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            abo.agregar(valor);
        }*/

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.- Imprimir el arbol");
            System.out.println("2.- Imprimir los nodos mayores a la raiz");
            System.out.println("3.- Imprimir Nodos hoja del arbol");
            System.out.println("4.- Buscar un nodo");
            System.out.println("0.- Salir");
            var = teclado.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Impresion del arbol, \ncada nodo en el nivel en que se encuentra");
                    abo.imprimirArbolConNivel();
                    break;
                case 2:
                    System.out.println("Nodos mayores a la raiz: ");
                    abo.imprimirNodosMayoreaARaiz();
                    break;
                case 3:
                    System.out.println("Nodos Hoja:");
                    abo.imprimirNodosHoja();
                    break;
                case 4:
                    int hoja;
                    System.out.println("Ingrese el valor del nodo: ");
                    hoja=teclado.nextInt();
                    if (abo.existe(hoja)== true){
                       System.out.println("Si existe "+hoja);
                    }else{
                        System.out.println("No existe "+hoja);
                    }
                               
                    break;
            }
        } while (var != 0);

    }

}