/*Faça um programa que leia o nome de um vendedor,
o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
comissão sobre suas vendas efetuadas, informar o total a receber
no final do mês, com duas casas decimais.*/

package ExerciciosBeeCrowd.Exercicio1009;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double comissao = 15;
        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioFinal = (salarioFixo + (comissao / 100) * totalVendas);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    }
}
