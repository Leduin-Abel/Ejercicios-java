import java.util.Scanner;

public class test5 {
    public static void main(String[] args){
        
        Scanner input =new Scanner (System.in);//Objeto entrada de teclado

        System.out.print("Ingrese el primer numero: ");
        int num1=input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2=input.nextInt();

        float res=num1*num2;

        System.out.println(num1 + "x" + num2 +"=" + res);

        input.close();
        


    }


}