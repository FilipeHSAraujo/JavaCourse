import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double priceOne,priceTwo, Checkout;
		int idprodOne, idprodTwo, quantOne, quantTwo;
			
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Carrinho de Compras!!!!!!!");
		System.out.print("Digite o  ID do primeiro produto: ");
		idprodOne = sc.nextInt();
		System.out.print("Digite a quantidade do primeiro produto: ");
		quantOne = sc.nextInt();
		System.out.print("Digite o preco do primeiro Produto: ");
		priceOne = sc.nextDouble();
		System.out.print("Digite o  ID do segundo produto: ");
		idprodTwo = sc.nextInt();
		System.out.print("Digite a quantidade do segundo produto: ");
		quantTwo = sc.nextInt();
		System.out.print("Digite o preco do segundo Produto: ");
		priceTwo = sc.nextDouble();
		Checkout = (quantOne * priceOne) + (quantTwo * priceTwo);
		System.out.printf("O Total da compra e de: R$%.2f!!!", Checkout);

	}

}
