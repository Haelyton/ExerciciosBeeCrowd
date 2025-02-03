package ExerciciosBeeCrowd.Exercicio1013;

import java.util.Scanner;

public class OMaior {

    public static Integer MaiorAb(int A, int B) {
        return (A + B + Math.abs(A - B)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maiorA = MaiorAb(A, B);

        if (maiorA > C){
            System.out.printf(maiorA + " eh o maior\n");
        }else {
            System.out.printf(C + " eh o maior\n");
        }
    }
}
