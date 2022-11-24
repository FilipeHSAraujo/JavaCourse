import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double area, ray, pi = 3.14159;
	
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Calculadora para Area do Circulo!!!!!!");
		System.out.print("Digite o valor do Raio: ");
		ray = sc.nextDouble();
		area = pi * (Math.pow(ray,2));
		System.out.printf("Que legal, o raio do seu circulo e %.4f!!!", area);

	}

}
