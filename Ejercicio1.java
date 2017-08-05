import java.util.Scanner;
/**
 * Contar la cantidad de bits en 1 que tiene la representación
 * binaria de un número usando las operaciones bit a bit.
 * 
 * @author Lida Heliana Arenas Mogollón 
 * @version 01/08/2017
 */
public class Ejercicio1
{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas pruebas va a realizar? ");
        int T = entrada.nextInt();
        int nums[] = new int[T];
        System.out.println("ingrese los "+T+" números");
        for(int i = 0; i<T; i++){
            nums[i]= entrada.nextInt();
        }
        
        for(int i = 0; i<T; i++){
            int tmp = nums[i];
            int cuenta = 0;
            for(int j=0; j<32;j++){
                cuenta = cuenta + (tmp & 1);
                tmp = tmp >> 1;
            }
            System.out.printf(
            "%d tiene %d bits = 1 en su representación binaria\n",
            nums[i], cuenta);
        }
    }
}