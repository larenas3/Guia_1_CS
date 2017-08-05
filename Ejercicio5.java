import java.util.Scanner;
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{
    // instance variables - replace the example below with your own
    private int N;
    private Scanner entrada;
    /**
     * Constructor for objects of class ContarBits
     */
    public Ejercicio5()
    {
        entrada = new Scanner(System.in);
        System.out.print("Cuantas pruebas va a realizar ");
        N = entrada.nextInt();
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
