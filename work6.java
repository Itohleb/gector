package hellowrld;

import java.util.Scanner;

public class work6 {
		 public static void main(String args[]) {
			   
		        Scanner in = new Scanner(System.in);
		   
		            System.out.println("������� 1 �����:");
		            float a = in.nextFloat();
		            System.out.println("������� 2 �����:");
		            float b = in.nextFloat();
		            System.out.println("������� 3 �����:");
		            float c = in.nextFloat();
		            if((a*a+b*b==c*c)||(a*a+c*c==b*b)|| (b*b+c*c==a*a))
		            {
		                System.out.print("������������");}
		            else System.out.println("���������������");
	}
	}
