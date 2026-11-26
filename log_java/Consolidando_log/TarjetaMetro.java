package log_java.Consolidando_log;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TarjetaMetro {
    private double saldo;

    public TarjetaMetro(double SaldoInicial){
        this.saldo=SaldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean recargar(double monto){
        if(monto > 0 && monto <= 100){
            this.saldo+=monto;
            return true;
        }else{
            return false;
        }
    }

    public boolean pagar(){
        if(this.saldo >= 2.50){
            this.saldo = this.saldo - 2.50;
            return true;
        }else{
            return false;
        }
    }

    public int viajesDisponibles(){
        return (int) (this.saldo / 2.50);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TarjetaMetro tj=new TarjetaMetro(10.0);
        boolean activo = true;

        while(activo){
            System.out.println("Transacción: ");
            System.out.println("1. Consultar saldo disponible");
            System.out.println("2. Recargar Tarjeta");
            System.out.println("3. Pagar pasaje");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            try{
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Saldo disponible: "+tj.getSaldo());
                        break;
                    case 2:
                        System.out.print("Monto: ");
                        double monto = sc.nextDouble();
                        if(tj.recargar(monto)){
                            System.out.println("Recarga exitosa, saldo actual: " + tj.getSaldo());
                            
                        }else{
                            System.out.println("monto inválido");
                        }
                        break;
                    case 3:
                        if(tj.pagar()){
                            System.err.println("Pago exitoso, saldo actual: "+tj.getSaldo());
                            System.out.println("Viajes posibles con saldo actual: " +tj.viajesDisponibles());
                        }else{
                            System.out.println("No es posible pagar pasaje");
                        }
                            break;
                    case 4:
                        activo = false;
                        break;
                
                    default:
                        System.out.println("opcion invalida");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Error: entrada inválida");
                sc.nextLine();

            }
        }
        sc.close();
    }
}
