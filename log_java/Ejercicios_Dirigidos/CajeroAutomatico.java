package log_java.Ejercicios_Dirigidos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CajeroAutomatico {
    private double saldo;

    public CajeroAutomatico(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto){
        if(monto > 0){
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto){
        if(monto > 0 && monto <= this.saldo){
            this.saldo -= monto;
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CajeroAutomatico ca=new CajeroAutomatico(1000.0);
        boolean activo = true;

        while(activo){
            System.out.println("\nCAJERO AUTOMÁTICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");    
            
            try{
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual: " + ca.getSaldo());
                        break;

                    case 2:
                        System.out.println("Monto a depositar: ");
                        double mon = sc.nextDouble();
                        if(ca.depositar(mon)){
                            System.out.println("Deposito exitoso, nuevo saldo: "+ca.getSaldo());
                        }else{
                            System.out.println("Monto inválido");
                        }
                        break;
                    
                    case 3: 
                    System.out.println("Monto a retirar: ");
                    double monto = sc.nextDouble();
                    if(ca.retirar(monto)){
                        System.out.println("retiro exitoso, saldo actual: "+ca.getSaldo());
                    }else{
                        System.out.println("Monto inválido");
                    }
                    break;

                    case 4:
                        System.out.println("Saliendo...");
                        activo = false;
                        break;
                
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            
            } catch (InputMismatchException e) {
            System.out.println("Error: entrada inválida");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
