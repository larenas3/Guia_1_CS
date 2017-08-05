import java.util.Scanner;
/**
 * Indicar si un número dado es primo o no
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 01/08/2017
 */
public class Ejercicio5
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas pruebas va a realizar ");
        int N = entrada.nextInt();
        int nums[] = new int[N];
        System.out.println("ingrese los "+N+" números");
        for(int i = 0; i<N; i++){
            nums[i]= entrada.nextInt();
        }
        
        for(int i = 0; i<N; i++){
            int primo = 0;
            int divisor = 2;
            if(nums[i]<2){
                primo = 1;
            }else{
                while(primo==0 && divisor<nums[i]){
                    if(nums[i]%divisor==0){
                        primo = 1;
                    }
                    divisor++;
                }
            }
            if(primo==0){
                System.out.printf("%d es primo\n",nums[i]);
            }else{
                System.out.printf("%d no es primo\n",nums[i]);
            }
        }
        
    }
}
