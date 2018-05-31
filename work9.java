package hellowrld;

import java.util.Scanner;

public class work9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("¬ведите число N:");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
               
                    sum+=i;
                    
        }
    }
        System.out.println("\n" + "—умма: "+sum);
	}
}


