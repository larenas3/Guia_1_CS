import java.util.Scanner;
/**
 * Sumar 2 números, cada uno entre 0 y 100
 * 
 * @author Lida Heliana Arenas Mogollón 
 * @version 01/08/2017
 */
public class Ejercicio3
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        do{
        System.out.println("Ingrese dos numeros entre 0 y 100");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        }while((num1<0||num1>100)||(num2<0||num2>100));
        System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,num1+num2);
    }
}
