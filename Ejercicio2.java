import java.util.Scanner;

/**
 * Sumar 3 números que entran por aparametro a una función
 * 
 * @author Lida Heliana Arenas Mogollón 
 * @version 01/08/2017
 */
public class Ejercicio2
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba 3 números para sumarlos");
        double n1=entrada.nextDouble();
        double n2=entrada.nextDouble();
        double n3=entrada.nextDouble();
        System.out.printf("Sumados da %.2f", sumarlos(n1, n2, n3));
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static double sumarlos(double a,double b,double c)
    {
        return a+b+c;
    }
}
