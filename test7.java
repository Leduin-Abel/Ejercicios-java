import java.util.Scanner;

public class test7 {
    public static void main(String[] args){
        Scanner intro=new Scanner (System.in);

        System.out.print("Ingrese el  numero: ");
        int num1=intro.nextInt();

        for(int i=0;i<=10;i++){
            
            System.out.println(num1 + "x" + i + "=" + num1*i);

        }
        intro.close();


  
    



    }


}