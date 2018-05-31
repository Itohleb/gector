package hellowrld;

import java.util.Scanner;

public class work1 {
	 public static void main(String[] args){
	        
	        int a;
	        Scanner scn=new Scanner(System.in);
	        System.out.println("¬ведите натуральное число");
	     
	        if(scn.hasNextInt()){
	            
	            a=scn.nextInt();
	            if(a % 2 == 0) {
	                System.out.print("„исло " + a + " четное");
	            } else {
	                System.out.print("„исло " + a + " нечетное");
	            }  
	            for(int i=(int)Math.sqrt(a);i>=1;i--){
	                if(a%i==0&i!=1){
	                    System.out.print(", составное");
	                    break;
	                    }
	                if(i==1) System.out.print(", простое");
	            }
	        }
	        else System.out.println("ќшибка. ¬ведено не целое число");
	        
	    }
	}