import java.util.Scanner;
/**
 * Contar la cantidad de 0 en la representación decimal del factorial
 * de un numero dado.
 * 
 * @author Lida Heliana Arenas Mogollón 
 * @version 01/08/2017
 */
public class Ejercicio4
{

    public static void main(String args[])
    {
        int T, ceros;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas pruebas va a realizar? ");
        T = entrada.nextInt();
        int nums[] = new int[T];
        System.out.println("ingrese los "+T+" números");
        for(int i = 0; i<T; i++){
            nums[i]= entrada.nextInt();
        }
        
        for(int i = 0; i<T; i++){
            long tmp = nums[i]-1;
            long fact = nums[i];
            while(tmp>1){
                fact *= tmp;
                tmp--;
            }
            ceros = 0;
            while(fact%10==0){
                ceros++;
                fact /= 10;
            }
            System.out.printf(
            "%d! tiene %d ceros al final de su representacion decimal\n",
            nums[i], ceros);
        }
        
    }
}