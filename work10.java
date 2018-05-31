package hellowrld;

import java.util.Scanner;

public class work10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Первое число: ");
        int a = sc.nextInt();
        System.out.println("Второе число: ");
        int b = sc.nextInt();
        System.out.println("Третье число: ");
        int c = sc.nextInt();
      
        int[] s = {a, b, c};
        permutate(s);
    }
 
    public static void permutate(int[] s){
        permuteIteration(s, 0);
    }
 
    private static void permuteIteration(int[] s2, int index){
        
        if(index >= s2.length - 1){ 
            for(int s: s2) System.out.print(s + " ");
            System.out.println("");
            return;
        }
        
        for(int i = index; i < s2.length; i++){ 
            int temp = s2[index];
            s2[index] = s2[i];
            s2[i] = temp;
 
            permuteIteration(s2, index+1);
 
            temp = s2[index];
            s2[index] = s2[i];
            s2[i] = temp;
        }
    }
}