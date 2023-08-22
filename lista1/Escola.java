import java.util.Scanner;
public class Escola {
     public static void main (String[] args ) {
    	 Scanner in = new Scanner (System.in); 
    	 int x;
    	 System.out.println("digite sua idade");
    	 x= in.nextInt();
    	 switch(x) {
    	 case 6:
    		 System.out.println("Dente De Leite");
    		 break;
    	 case 7:
    		 System.out.println("Junior");
    		 break;
    	 case 8:
    		 System.out.println("Junior Max");
    		 break;
    	 case 9:
    		 System.out.println("Junior Master");
    		 break;
    	 case 10:
    		 System.out.println("Master");
    		 break;
    	default:
    		System.out.println("não pode se matricular");
    	 }
     }
}
