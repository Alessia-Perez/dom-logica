package log_java;
import java.util.Scanner;

public class FiltroPares{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    while(true){
    System.out.print("¿Cuántos números ingresará?: ");
    int cantidad = sc.nextInt();
    
    if(cantidad == -1){
        System.err.println("Saliendo...");
        break;

    }
    int suma = 0;
    int pares = 0;
    int impares = 0;

    for(int i=0; i<cantidad ; i++){
        System.out.println("Ingrese el " + (i+1) + " número :");
        int numero = sc.nextInt();
        suma += numero;

        if(numero % 2 == 0){
            pares ++;
        }
        else {
            impares++;
        }
    }

    double promedio = (double) suma/cantidad;

    System.out.println("la suma es: "+suma);
    System.out.println("cantidad de pares: "+pares);
    System.out.println("cantidad de impares: "+impares);
    System.out.println("promedio: "+promedio);   
    }
    sc.close();
}

}
