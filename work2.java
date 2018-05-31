package hellowrld;

import java.util.Scanner;

public class work2 {
	   private static int gcd(int a, int b) {
	    	return b == 0 ? a : gcd(b,a % b);
   		}
	   private static int lcm(int a, int b) {
		   return a / gcd(a,b) * b;
  		}
	   public static void main(String args[]) {
		   
	        Scanner in = new Scanner(System.in);
	        try {
	            System.out.println("Введите первое число:");
	            int a = in.nextInt();
	            System.out.println("Введите второе число:");
	            int b = in.nextInt();
	            int sum = a+b;
	            int razn = a-b;
	            System.out.println("Сумма = "+sum);
	            System.out.println("Сумма = "+razn);
	            System.out.println("НОД ="+gcd(a, b));
	            System.out.println("НОК ="+lcm(a, b));
	        } catch (Exception e) {
	            System.out.println("Неверные данные!");
	        }
	    }  

	
       
	   
}
