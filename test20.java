import java.util.Scanner;

public class test20{
    public static void main(String[] args){

        int dec_num, rem;
        String hexdec_num="";
        
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
       // dec_num = in.nextInt();
		dec_num = 15;
        while(dec_num>0)
        {
            rem = dec_num%16;
            System.out.print("rem: " + rem + "\n");
            System.out.print("hex[rem]: " + hex[rem] + "\n");
            hexdec_num = hex[rem] + hexdec_num;
            System.out.print("hexdec_num: " + hexdec_num + "\n");
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");    
    }}