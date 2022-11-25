import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double A,B,C,AT,AC,ATr,AQ,AR,pi=3.14159;

			
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Calculador de Areas!!!!!!!");
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();

		AT = (A*C)/2;
		AC = pi*(Math.pow(C, 2));
		ATr = ((A+B)*C)/2;
		AQ = Math.pow(B, 2);
		AR = A * B;
		
		System.out.println("O Total dos calculos de area foram: ");
		System.out.printf("Area do Triangulo: %.3f%n", AT);
		System.out.printf("Area do Circulo: %.3f%n", AC);
		System.out.printf("Area do Trapezio: %.3f%n", ATr);
		System.out.printf("Area do Quadrado: %.3f%n", AQ);
		System.out.printf("Area do Retangulo: %.3f%n", AR);
				

	}

}
