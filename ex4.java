import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);

		
		
		int n, m, d;
		
		System.out.println("Escreva na ordem decrescente o tamanho dos lados do triângulo:");
		n = leitor.nextInt();
		m = leitor.nextInt();
		d = leitor.nextInt();
		
		if ( n == m && m == d)
			System.out.println("É um triângulo equitátero.");
		if ( n == m && m != d)
			System.out.println("É um triângulo isósceles.");
		if ( n != m && m != d && n != d)
			System.out.println("É um triângulo escaleno.");
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
