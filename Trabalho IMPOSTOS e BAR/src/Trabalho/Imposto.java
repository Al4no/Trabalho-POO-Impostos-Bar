package Trabalho;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Renda anual com salário: ");
	        double rendaAnualSalario = sc.nextDouble();

	        System.out.print("Renda anual com prestação de serviço: ");
	        double rendaAnualServicos = sc.nextDouble();

	        System.out.print("Renda anual com ganho de capital: ");
	        double rendaAnualCapital = sc.nextDouble();

	        System.out.print("Gastos médicos: ");
	        double gastosMedicos = sc.nextDouble();

	        System.out.print("Gastos educacionais: ");
	        double gastosEducacionais = sc.nextDouble();

	        // Cálculo do imposto sobre salário
	        double salarioMensal = rendaAnualSalario / 12;
	        double impostoSalario = 0.0;
	        if (salarioMensal >= 3000 && salarioMensal < 5000) {
	            impostoSalario = rendaAnualSalario * 0.10;
	        } else if (salarioMensal >= 5000) {
	            impostoSalario = rendaAnualSalario * 0.20;
	        }

	        // Cálculo do imposto sobre serviços
	        double impostoServicos = rendaAnualServicos * 0.15;

	        // Cálculo do imposto sobre ganho de capital
	        double impostoCapital = rendaAnualCapital * 0.20;

	        // Cálculo do imposto bruto total
	        double impostoBrutoTotal = impostoSalario + impostoServicos + impostoCapital;

	        // Cálculo do máximo dedutível (30% do imposto bruto total)
	        double maximoDedutivel = impostoBrutoTotal * 0.30;

	        // Cálculo dos gastos dedutíveis (gastos médicos e educacionais)
	        double gastosDedutiveis = gastosMedicos + gastosEducacionais;

	        // Abatimento (o menor entre o máximo dedutível e os gastos dedutíveis)
	        double abatimento = Math.min(maximoDedutivel, gastosDedutiveis);

	        // Cálculo do imposto devido
	        double impostoDevido = impostoBrutoTotal - abatimento;

	        // Exibição do relatório
	        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
	        System.out.println("* CONSOLIDADO DE RENDA:");
	        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
	        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServicos);
	        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);

	        System.out.println("* DEDUÇÕES:");
	        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
	        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);

	        System.out.println("* RESUMO:");
	        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
	        System.out.printf("Abatimento: %.2f\n", abatimento);
	        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

	        sc.close();
	}

}
