import java.util.Scanner;




public class test12 {
    public static void main(String[] args){
        
        Scanner input =new Scanner (System.in);

        System.out.print("Ingrese primer numero: ");
        double num1=input.nextDouble();

        System.out.print("Ingrese segundo numero: ");
        double num2=input.nextDouble();

        System.out.print("Ingrese tercer numero: ");
        double num3=input.nextDouble();

        System.out.println("El promedio de los numeros ingresados es: " + (num1+num2+num3)/3);
        

        

        input.close();
  
    



    }


}