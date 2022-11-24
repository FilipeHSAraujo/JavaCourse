import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int A, B, C, D, Dif;
		
	
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Calculadora para Diferença de numero!!!!!!!");
		System.out.println("Digite 4 numeros inteiros na mesma linha, os separe com espaço.");
		System.out.print("Digite os 4 valores separados por espaco: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Dif=(A*B)-(C*D);
		System.out.printf("Que legal, a diferenca de seus numeros sao %d!!!", Dif);

	}

}
