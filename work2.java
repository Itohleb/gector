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
	            System.out.println("������� ������ �����:");
	            int a = in.nextInt();
	            System.out.println("������� ������ �����:");
	            int b = in.nextInt();
	            int sum = a+b;
	            int razn = a-b;
	            System.out.println("����� = "+sum);
	            System.out.println("����� = "+razn);
	            System.out.println("��� ="+gcd(a, b));
	            System.out.println("��� ="+lcm(a, b));
	        } catch (Exception e) {
	            System.out.println("�������� ������!");
	        }
	    }  

	
       
	   
}
