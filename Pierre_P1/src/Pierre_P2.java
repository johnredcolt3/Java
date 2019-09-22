import java.util.Scanner;

public class Pierre_P2 {
	public static void main(String[] args) { 
		int num0,bwp,bwk,hi,hm;
		double bmi1,bmi2;
		System.out.println(" Type 1 if you want to print BMI in lbs, 2 if you want to print in kg: ");
		Scanner scnr = new Scanner(System.in);
		num0 = scnr.nextInt();
		 if (num0==1)
		 {
			 System.out.print(" Enter weight in pounds: ");
			 bwp = scnr.nextInt();
			 System.out.print(" Enter height in inches: ");
			 hi = scnr.nextInt();
			 bmi1 = (703*bwp)/(hi*hi);
			 
			 
			 if(bmi1<18.5)
				 System.out.println(" Your bmi is : " + bmi1 + "\n Category: Underweight" );
			 else if(bmi1<=24.9)
				 System.out.println(" Your bmi is : " + bmi1 + "\n Category: Normal weight" );
			 else if(bmi1<30)
				 System.out.println(" Your bmi is : " + bmi1 + "\n Category: Overweight" );
			 else if(bmi1>=30)
				 System.out.println(" Your bmi is : " + bmi1 + "\n Category: Obesity" );	
			 
		 }
		 else if (num0==2)
		 {
			 System.out.print(" Enter weight in Kilograms: ");
			 bwk = scnr.nextInt();
			 System.out.print(" Enter height in meters: ");
			 hm = scnr.nextInt();
			 bmi2 = (703*bwk)/(hm*hm);
			 
			 
			 if(bmi2<18.5)
				 System.out.println(" Your bmi is : " + bmi2 + "\n Category: Underweight" );
			 else if(bmi2<=24.9)
				 System.out.println(" Your bmi is : " + bmi2 + "\n Category: Normal weight" );
			 else if(bmi2<30)
				 System.out.println(" Your bmi is : " + bmi2 + "\n Category: Overweight" );
			 else if(bmi2>=30)
				 System.out.println(" Your bmi is : " + bmi2 + "\n Category: Obesity" );	
			 
		 }
		 else 
			 System.out.println(" Incorrect input");
		 
		 scnr.close();
	}

}
