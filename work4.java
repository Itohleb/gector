package hellowrld;
import java.util.Arrays;
import java.util.Scanner;
public class work4 {

	        public static void main(String[] args) {
	 
	            Scanner sc = new Scanner(System.in);
	            System.out.print("������� �����������: ");
	            String line = sc.nextLine();
	            String[] words = line.split("\\s+");
	            System.out.println("��������������� �����: " + Arrays.toString(words));
	            Arrays.sort(words);
	            System.out.println("������������� �����: " + Arrays.toString(words));
	            
	            int count = 0;
	       	 
	           
	            if(line.length() != 0){
	                count++;
	                
	                for (int i = 0; i < line.length(); i++) {
	                	if((line.charAt(i) == ' ' ) | (line.charAt(i)==',')){
	                        
	                        count++;
	                    }
	                }
	                
	            }
	            System.out.println("������� ����: "+count);
	        }
	           
	}