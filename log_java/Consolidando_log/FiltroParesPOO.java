package log_java.Consolidando_log;

import java.util.Scanner;

public class FiltroParesPOO {
    double suma;
    int pares;
    int impares;
    int cantidad;

    public FiltroParesPOO(){
        this.suma=0;
        this.pares=0;
        this.impares=0;
        this.cantidad=0;
    }

    public void filtros(int numero){
        this.suma += numero;
        this.cantidad++;

        if(numero % 2 == 0){
            pares++;
        }else{
            impares++;
        }
}

public double getSuma(){
    return this.suma;
}

public int getPares() {
    return pares;
}

public int getImpares() {
    return impares;
}

public double promedio(){
    if(this.cantidad == 0){
        return 0.0;
    }else{
        return (double) this.suma/this.cantidad;
    }
}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

while(true){
    System.out.println("Cantidad de números a ingresar: ");
    int n = sc.nextInt();

    if(n == -1){
        System.out.println("Saliendo...");
        break;
    }
FiltroParesPOO fl=new FiltroParesPOO();

    for(int i=0; i<n; i++){
        System.out.println("Ingrese el número");
        int num = sc.nextInt();
        fl.filtros(num);
    }

    System.out.println("La suma es: " + fl.getSuma());
    System.out.println("Cantidad de pares: " + fl.getPares());
    System.out.println("Cantidad de impares: " + fl.getImpares());
    System.out.println("Promedio: " + fl.promedio());
}

sc.close();
}


}
