/*Neste problema, deve-se ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
Após, calcule e mostre o valor a ser pago.*/

package ExerciciosBeeCrowd.Exercicio1010;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPecas1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

        int codigoPecas2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();

        double soma = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

    }
}
