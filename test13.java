import java.util.Scanner;

public class test13 {
    public static void main(String[] args){
        
        Scanner input =new Scanner (System.in);

        System.out.print("Ingrese altura: ");
        double num1=input.nextDouble();

        System.out.print("Ingrese ancho: ");
        double num2=input.nextDouble();
        

        System.out.println("El perimetro  es: " + 2*(num1+num2));
        System.out.println("El area es: " + num1*num2);
        

        

        input.close();
  
    



    }


}