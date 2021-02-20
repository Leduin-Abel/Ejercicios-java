import java.util.Scanner;

public class test20{
    public static void main(String[] args){
   
        int numero;

        int i=0;
        Integer[] hexa1 = new Integer[20];
        String[] hexa2={};
        String A="A",B="B",C="C",D="D",E="E",F="F";
        Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce un numero: ");                                                
            numero = entrada.nextInt();
            

            while(numero >=16){
                hexa1[i++]=numero%16;
                numero=numero/16;
            }
            hexa1.toString();
    
            do{
               
                if(hexa1[i]==10){
                    hexa2[i]=A;
                }
                else if(hexa1[i]==11){
                    hexa2[i]=B;
                }
                else if(hexa1[i]==12){
                    hexa2[i]=C;
                }
                else if(hexa1[i]==13){
                    hexa2[i]=D;
                }
                else if(hexa1[i]==14){
                    hexa2[i]=E;
                }
                else if(hexa1[i]==15){
                    hexa2[i]=F;
                }
                i--;

            }while(i>=0);


                System.out.print(hexa2);
            

            entrada.close();
    }

    }


