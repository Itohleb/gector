package hellowrld;

import java.util.Scanner;

public class work1 {
	 public static void main(String[] args){
	        
	        int a;
	        Scanner scn=new Scanner(System.in);
	        System.out.println("������� ����������� �����");
	     
	        if(scn.hasNextInt()){
	            
	            a=scn.nextInt();
	            if(a % 2 == 0) {
	                System.out.print("����� " + a + " ������");
	            } else {
	                System.out.print("����� " + a + " ��������");
	            }  
	            for(int i=(int)Math.sqrt(a);i>=1;i--){
	                if(a%i==0&i!=1){
	                    System.out.print(", ���������");
	                    break;
	                    }
	                if(i==1) System.out.print(", �������");
	            }
	        }
	        else System.out.println("������. ������� �� ����� �����");
	        
	    }
	}