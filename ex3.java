import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
			
		Scanner leitor = new Scanner (System.in);
		float salario;
		
		System.out.println("Digite seu sal�rio:");
		salario = leitor.nextFloat();
		
		if (salario  >= 0 && salario <= 1000) 
			System.out.println("Seu sal�rio novo ser�:  " + (salario + (salario / 100 * 15 )));
		
		else if (salario  >= 1000.01 && salario <= 2500) 
			System.out.println("Seu sal�rio novo ser�:  " + (salario + (salario / 100 * 7 )));
		
		else if   (salario > 2500.01)
		System.out.println("Seu sal�rio n�o ter� reajuste.");
	
		
		
		
		
		
	}
	
}
	