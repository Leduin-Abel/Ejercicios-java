import java.util.Scanner;




public class test11 {
    public static void main(String[] args){
        
        Scanner input =new Scanner (System.in);

        System.out.print("Ingrese el radio ");
        double radio=input.nextDouble();

        System.out.println("El perimetro es:" + 2*Math.PI*radio);


        System.out.println("El area es:" + Math.PI*Math.pow(radio, 2));

    
        input.close();
  
    



    }


}