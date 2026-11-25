package log_java.Consolidando_log;
import java.util.Arrays;
import java.util.Scanner;

public class BuscadorMayorVenta {
    private double[] monto;

    public BuscadorMayorVenta(double[] monto){
        this.monto=monto;
    }

    public double ventaMasAlta(){
        double mayor = this.monto[0];
        

        for(int i=1; i<this.monto.length; i++){
            if(this.monto[i] > mayor){
                mayor = this.monto[i];
            }
        }

        return mayor;
    }


    public int validacion(){
        int contadorMetaSuperada = 0;
        for(int i = 0; i<this.monto.length; i++){
           if(this.monto[i] >= 500){
            contadorMetaSuperada++;
           }
        } 
        return contadorMetaSuperada;
    }

   public double sumatotal(){
    double suma = 0.0;
    for(int i = 0; i<this.monto.length; i++){
           suma += this.monto[i];
   }
   return suma;
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Días a Evaluar: ");
        int dias = sc.nextInt();
        double[] listadias = new double[dias];

        for(int i=0; i<dias;i++){
            System.out.print("Monto del día "+(i+1)+" : ");
            listadias[i] = sc.nextDouble();
        }
        BuscadorMayorVenta bs=new BuscadorMayorVenta(listadias);

        System.out.println("Ventas Ingresadas: "+Arrays.toString(listadias));
        System.out.println("Venta más alta: " + bs.ventaMasAlta()+"\nDinero recaudado: "+bs.sumatotal()+"\nDías en que se superó la meta: "+bs.validacion());

        sc.close();
    }
}
