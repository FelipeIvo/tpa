import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mes, dia;
		
		System.out.println("Digite o dia que voc� nasceu");
		dia= in.nextInt();
		System.out.println("Digite o m�s que voc� nasceu");
		mes= in.nextInt();

		switch (mes) {
		
		case 1:
			if (dia < 21 && dia > 0){
				System.out.println(" � de Capric�rnio");
			} else if (dia<32){
				System.out.println(" � de Aqu�rio");
			}
		break;
		
		case 2:
			if (dia < 19 && dia > 0){
				System.out.println(" � de Aqu�rio");
			} else if (dia<29){
				System.out.println(" � de Peixes");
			}
		break;
		
		case 3:
			if (dia < 21 && dia > 0) {
				System.out.println(" � de Peixes");
			} else if (dia>32){
				System.out.println(" � de �ries");
			}
		break;
		
		case 4:
			if (dia < 21 && dia > 0){
				System.out.println(" � de �ries");
			} else if (dia < 31){
				System.out.println(" � de Touro");
			}
		break;
		
		case 5:
			if (dia < 21 && dia > 0){
				System.out.println(" � de Touro");
			} else if (dia < 32){
				
				System.out.println(" � de G�meos");
			}
		break;
		
		case 6:
			if (dia < 21 && dia > 0){
				System.out.println(" � de G�meos");
			} else if (dia < 31){
				System.out.println(" � de C�ncer");
			}
		break;
		
		case 7:
			if (dia < 23 && dia > 0) {
				System.out.println(" � de C�ncer");
			} else if (dia < 31){
				System.out.println(" � de Le�o");
			}
		break;
		
		case 8:
			if (dia < 23 && dia > 0){
				System.out.println(" � de Le�o");
			} else if (dia < 32){
				System.out.println(" � de Virgem");
			}
		break;
		
		case 9:
			if (dia < 24 && dia > 0){
				System.out.println(" � de Virgem");
			} else if (dia < 31){
				System.out.println(" � de Libra");
			}
		break;
		
		case 10:
			if (dia < 24 && dia > 0){
				System.out.println(" � de Libra");
			} else if (dia < 32){
				System.out.println(" � de Escorpi�o");
			}
		break;
		
		case 11:
			if (dia < 22 && dia > 0){
				System.out.println(" � de Escorpi�o");			
			} else if(dia < 31){
				System.out.println(" � de Sagit�rio");
			}
		break;
		
		case 12:
			if (dia < 22 && dia > 0){
				System.out.println(" � de Sagit�rio");
			} else if (dia < 32){
				System.out.println(" � de Capric�rnio");
			}
		break;
		
		default:
			System.out.println("M�s inv�lido");
		}
	}
}