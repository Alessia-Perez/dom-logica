package log_java;

import java.util.Arrays;
import java.util.Scanner;

public class EliminadorMenor{
    private double[] notas;

    public EliminadorMenor(double[] notas){
        this.notas = notas;
    }

    public double obtenerMenorNota(){
        double menor = this.notas[0];
        for(int i=1; i<this.notas.length; i++){
            if(this.notas[i] < menor){
                menor = this.notas[i];
            }
        }
        return menor;
    }

    public double calcularPromedio(){
        if(this.notas.length <= 1){
            return 0.0;
        }

        double suma = 0.0;
        for(int i=0; i<this.notas.length; i++){
            suma += this.notas[i];
        }

       double EliminarMenor = suma - obtenerMenorNota();
       return EliminarMenor / (this.notas.length - 1);
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Notas a ingresar: ");
        int cant = sc.nextInt();
        double[] listaNotas = new double[cant];

        for(int i= 0; i<cant; i++){
            System.out.println("Ingrese la nota; " + (i+1) + ": ");
            listaNotas[i] = sc.nextDouble();
        }

        EliminadorMenor el=new EliminadorMenor(listaNotas);

        System.out.println("\nNotas registradas: " + Arrays.toString(listaNotas));
        System.out.println("Nota más baja eliminada: " + el.obtenerMenorNota());
        System.out.println("Promedio final (sin la menor): " + el.calcularPromedio());

        sc.close();
    }

}