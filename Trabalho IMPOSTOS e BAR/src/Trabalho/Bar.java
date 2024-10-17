package Trabalho;
import java.util.Scanner;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner sc = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Sexo (F/M): ");
	        char sexo = sc.next().charAt(0);

	        System.out.print("Quantidade de cervejas: ");
	        int qtdCervejas = sc.nextInt();

	        System.out.print("Quantidade de refrigerantes: ");
	        int qtdRefrigerantes = sc.nextInt();

	        System.out.print("Quantidade de espetinhos: ");
	        int qtdEspetinhos = sc.nextInt();

	        // Definir valores
	        double precoIngresso = (sexo == 'F' || sexo == 'f') ? 8.0 : 10.0;
	        double valorCerveja = 5.0;
	        double valorRefrigerante = 3.0;
	        double valorEspetinho = 7.0;
	        double valorCouvert = 4.0;

	        // Cálculo do consumo
	        double consumo = (qtdCervejas * valorCerveja) + (qtdRefrigerantes * valorRefrigerante) + (qtdEspetinhos * valorEspetinho);

	        // Verifica se há isenção do couvert artístico
	        double couvert = (consumo > 30.0) ? 0.0 : valorCouvert;

	        // Cálculo do valor total a pagar
	        double valorTotal = consumo + precoIngresso + couvert;

	        // Exibição do relatório
	        System.out.println("### RELATÓRIO ###");
	        System.out.printf("Consumo = R$ %.2f\n", consumo);
	        if (couvert == 0.0) {
	            System.out.println("Isento de Couvert");
	        } else {
	            System.out.printf("Couvert = R$ %.2f\n", couvert);
	        }
	        System.out.printf("Ingresso = R$ %.2f\n", precoIngresso);
	        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

	        sc.close();
	}

}
