import java.util.Scanner;

public class test19{
    public static void main(String[] args){
        int numero=5;
        int i=1;
        String t;
        int n;

        
        Scanner entrada = new Scanner(System.in);

            //System.out.print("Introduce un numero: ");                                                
            //numero = entrada.nextInt();
            t=String.valueOf(numero);
            n=t.length();
            int[] binario= new int[n];

            while(numero >=1){
                binario[i++]=numero%2;
                numero=numero/2;
            }
    
            while(i>=0){
                System.out.println(binario[i--]);
            }
            entrada.close();
  
    }

    }


