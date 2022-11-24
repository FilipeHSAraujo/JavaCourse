import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	//variables
		int x, y;
	
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Calculadora para soma!!!!!!");
		System.out.print("Digite o primeiro numero: ");
		x = sc.nextInt();
		System.out.print("Digite o Segundo numero: ");
		y = sc.nextInt();
		int soma = x+y;		
		System.out.printf("Que legal, a sua soma deu %d!!!", soma);

	}

}
