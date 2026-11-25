package log_java.Pruebas;
import java.util.Scanner;

public class AnalizadorTemperaturas {
   private int cantidadregistrada;
   private double suma;
   private int contadorDiasCalurosos;
   private int contadorDiasFrescos;

   public AnalizadorTemperaturas(){
    this.cantidadregistrada = 0;
    this.suma=0.0;
    this.contadorDiasCalurosos = 0;
    this.contadorDiasFrescos = 0;
   }


   public void clasificar(double temperatura){
    suma += temperatura;
    cantidadregistrada++;

    if(temperatura >= 25.0){
        contadorDiasCalurosos++;
    }else{
        contadorDiasFrescos++;
    }


   }

   public int getCantidadregistrada() {
       return cantidadregistrada;
   }
   public int getContadorDiasCalurosos() {
       return contadorDiasCalurosos;
   }
   public int getContadorDiasFrescos() {
       return contadorDiasFrescos;
   }
   public double getSuma() {
       return suma;
   }



public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    AnalizadorTemperaturas an=new AnalizadorTemperaturas();
    System.out.println("Ingrese temperaturas: ");

    while(true){
        System.out.print("Temperatura #"+(an.getCantidadregistrada()+1) +": ");
        String entrada = sc.next();

        if(entrada.equalsIgnoreCase("fin")){
            break;
        }

        double temp = Double.parseDouble(entrada);
        an.clasificar(temp);
    }

        System.out.println("Suma: " + an.getSuma());
        System.out.println("Días frescos: " + an.getContadorDiasFrescos());
        System.out.println("Días calurosos: " + an.getContadorDiasCalurosos());
        System.out.println("Cantidad ingresada: " + an.getCantidadregistrada());   
        
        sc.close();
   }
}
