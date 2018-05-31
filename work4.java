package hellowrld;
import java.util.Arrays;
import java.util.Scanner;
public class work4 {

	        public static void main(String[] args) {
	 
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Введите предложение: ");
	            String line = sc.nextLine();
	            String[] words = line.split("\\s+");
	            System.out.println("Несортированные слова: " + Arrays.toString(words));
	            Arrays.sort(words);
	            System.out.println("Сортированные слова: " + Arrays.toString(words));
	            
	            int count = 0;
	       	 
	           
	            if(line.length() != 0){
	                count++;
	                
	                for (int i = 0; i < line.length(); i++) {
	                	if((line.charAt(i) == ' ' ) | (line.charAt(i)==',')){
	                        
	                        count++;
	                    }
	                }
	                
	            }
	            System.out.println("Введено слов: "+count);
	        }
	           
	}