package hellowrld;

import java.util.Scanner;

public class work5 {
	 public static int substringCount(String message, String word) {
		   message = message.toLowerCase();
	        word = word.toLowerCase();
	        int i = message.indexOf(word);
	        int count = 0;
	        while (i >= 0) {
	            count++;
	            i = message.indexOf(" " + word+ " ", i + 1);
	        }
	        return count;
		    }
		 
		    public static void main(String[] args) {
		    	
		    	System.out.print("Введите текст: ");
		        Scanner sc = new Scanner(System.in);
	            String message = sc.nextLine();
		        
		    	System.out.println("Введите слово: ");
		        Scanner scan1 = new Scanner(System.in);
		        String word=scan1.next();
		       
		        System.out.println("Колличество слов: " + substringCount(message, word));
		    }
		}