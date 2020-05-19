import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Nadador, digite sua idade:");
		int num = leitor.nextInt();
		
		if (num >= 5 && num <=10)
		System.out.println("Sua categoria é: infantil.");
		else if (num < 5)
		System.out.println("Erro");
		else if  (num >= 11 && num <=17)
		System.out.println("Sua categoria é: juvenil.");
		if (num >= 18)
		System.out.println("Sua categoria é: adulto (a)");
		
		
		

	}

}
