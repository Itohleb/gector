package hellowrld;

import java.util.Scanner;

public class work6 {
		 public static void main(String args[]) {
			   
		        Scanner in = new Scanner(System.in);
		   
		            System.out.println("Введите 1 число:");
		            float a = in.nextFloat();
		            System.out.println("Введите 2 число:");
		            float b = in.nextFloat();
		            System.out.println("Введите 3 число:");
		            float c = in.nextFloat();
		            if((a*a+b*b==c*c)||(a*a+c*c==b*b)|| (b*b+c*c==a*a))
		            {
		                System.out.print("Прямоугльный");}
		            else System.out.println("Непрямоугольный");
	}
	}
