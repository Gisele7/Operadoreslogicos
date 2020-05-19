import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		boolean resultado;
		float media = 7 ;
		
		Scanner leitor =  new Scanner (System.in);
		
		System.out.println("Digite sua média:");
		media = leitor.nextFloat();
		
		
		if (media >=7) {
		System.out.println("Você está aprovado, parabéns!");
		}
		if (media  >= 3.5 && media < 7.0)
		System.out.println("Você está de recuperação.");
		else if (media < 3.5 )
		 System.out.println("Você está reprovado.");
	}
}
