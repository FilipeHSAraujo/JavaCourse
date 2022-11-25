import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double pay, hour,paycheck;
		int id;
			
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Calculadora de Pagamento por Hora Trabalhada!!!!!!!");
		System.out.print("Digite seu ID: ");
		id = sc.nextInt();
		System.out.print("Digite suas Horas Trabalhadas: ");
		hour = sc.nextDouble();
		System.out.print("Digite o valor que recebe por hora: ");
		pay = sc.nextDouble();
		paycheck = pay * hour;
		System.out.printf("Funcionario de ID %d, seu salario e de: U$%.2f!!!", id, paycheck);

	}

}
