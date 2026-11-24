package log_java;
import java.util.Scanner;

public class ValidadorNotas{
   private double nota;

    public ValidadorNotas(double nota) {
        this.nota = nota;
    }

    public String Validar(){
        if(nota < 0 || nota > 20){
            return "Nota inválida";
        }
        else if(nota < 10.5){
            return "Desaprobado";
        }
        else if(nota < 13.9){
            return "Regular";
        }
        else if(nota < 17.9){
            return "Bueno";
        }
        else {
            return "Excelente";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
        System.out.print("Ingresa una nota del 0 al 20: ");
        double notaIngresada = sc.nextDouble();

        if(notaIngresada == -1){
       System.out.println("Saliendo...");
       break;
        }

        ValidadorNotas val = new ValidadorNotas(notaIngresada);
        String resultado = val.Validar();
        System.out.println("Evaluación: " + resultado);    
    }
        sc.close();
    }

}