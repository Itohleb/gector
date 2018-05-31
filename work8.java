package hellowrld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class work8 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		        
		        System.out.println("¬ведите число от 0 do N:");
		        int b = Integer.parseInt(reader.readLine());
		        for (int i = 0; i < b; i++){
		            int ch = i/10;
		 
		            if (  ch==(i-ch)/10 && (i-ch)%10==0 ){
		            System.out.print(i+ " ");}
		   }
		 
		}
}