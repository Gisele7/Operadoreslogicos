import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
 
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite um n�mero:");
		int num = leitor.nextInt();
		
		if (num >= 20 && num <= 90)
			System.out.println("O n�mero est� entre 20 e 90.");
		else 
			System.out.println("O n�mero � menor que 20 ou maior que 90.");
		

	}

}
