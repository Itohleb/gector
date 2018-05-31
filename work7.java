package hellowrld;


import java.util.Scanner;

public class work7 {
	public static void main(String[] args) {
		  int n,arr[];
      Scanner in = new Scanner(System.in);
      System.out.print("Введите размер массива: ");
      n = in.nextInt();
      arr = new int [n];
      for (int i=0;i<arr.length;i++)
              arr[i] = (int) ( Math.random() * 199-99);
      for (int i: arr)
              System.out.print( i + " ");
      		
      int x = arr[0];
      int y = arr[0];
      for(int i = 0; i < arr.length; i++) {
      	 	   
          if(arr[i] >= x) {
          
            x= arr[i];
          
          }
          
          if(arr[i] <= y) 
             
             y = arr[i];
             
       }
      
      System.out.print("\n" + "Наибольшее число: " +x + " и Наименьшее число: " +y);
  }
}