import java.util.Scanner; 
public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int x;
		System.out.println("Escreva o lanche que você quer");
		x=in.nextInt();
		
		switch(x) {
	   	 case 1:
	   	 System.out.println("cachorro quente custa R$ 8,00");
	   	 break;
	   	case 2:
	      	 System.out.println("Cheeseburger custa R$ 12,00");
	      	break;
	   	case 3:
	      	 System.out.println("X-Salada custa R$ 15,00 ");
	      	 break;
	   	case 4:
	      	 System.out.println("Misto Quente custa R$ 11,00 ");
	      	 break;
	   	case 5:
	      	 System.out.println("Pão na chapa custa R$ 6,00");
	      	 break;
	    default:
	    	System.out.println("número inválido");
	   	 }
	}
}