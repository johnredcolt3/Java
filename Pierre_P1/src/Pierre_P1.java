
import java.util.Scanner;

public class Pierre_P1 {
	public static void main(String[] args) { 
		 int num0,num1;
		 System.out.println("Enter a 4 digit # to encrypt: ");
		 Scanner scnr = new Scanner( System.in );
		 num0 = scnr.nextInt();
		 encrypt(num0);
		 System.out.println("Enter a 4 digit # to decrypt: ");
		 num1 = scnr.nextInt();
		 Decrypt(num1);
		 scnr.close();
		 
	}
	public static int encrypt(int num0) {
		 int num1, num2, num3 , num4;
		 num1 = num0%10;
		 num0 = num0/10;
		
		 num2 = num0%10;
		 num0 = num0/10;
		 
		 num3 = num0%10;
		 num0 = num0/10;
		 
		 num4 = num0%10;
		 
		 num1 = (num1 + 7)%10;
		 num2 = (num2 + 7)%10;
		 num3 = (num3 + 7)%10;
		 num4 = (num4 + 7)%10;
		 
		 System.out.print(num3);
		 System.out.print(num4);
		 System.out.print(num1);
		 System.out.println(num2);
		 return num0;
	 }
	 public static int Decrypt(int num0) {
		 int num1, num2, num3 , num4;
		 num1 = num0%10;
		 num0 = num0/10;
		
		 num2 = num0%10;
		 num0 = num0/10;
		 
		 num3 = num0%10;
		 num0 = num0/10;
		 
		 num4 = num0%10;
		 
		 num1 = (num1+3)%10;
		 num2 = (num2+3)%10;
		 num3 = (num3+3)%10;
		 num4 = (num4+3)%10;
		 
		 System.out.print(num3);
		 System.out.print(num4);
		 System.out.print(num1);
		 System.out.print(num2);
		 return num0;
		 		 
	 }
	 }


