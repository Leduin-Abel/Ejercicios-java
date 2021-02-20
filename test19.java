import java.util.Scanner;

public class test19{
    public static void main(String[] args){
   
        int numero;
        int i=0;
        int[] binario= new int[20];
        Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce un numero: ");                                                
            numero = entrada.nextInt();
            

            while(numero >=1){
                binario[i++]=numero%2;
                numero=numero/2;
            }
    
            while(i>=0){
                System.out.print(binario[i--]);
            }
            entrada.close();
    }

    }


