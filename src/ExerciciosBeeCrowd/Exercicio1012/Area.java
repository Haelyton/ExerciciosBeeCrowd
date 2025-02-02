/*Escreva um programa que leia três valores com ponto flutuante
de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

package ExerciciosBeeCrowd.Exercicio1012;

import java.util.Scanner;

public class Area {

    public static Double AreaTriangulo(double A, double C){
        return (A * C) / 2;
    }

    public static Double AreaCirculo(double C, double pi){
        return pi * Math.pow(C, 2);
    }

    public static Double AreaTrapezio(double A, double B, double C){
        return (A + B) * C / 2;
    }

    public static Double AreaQuadrado(double B){
        return Math.pow(B, 2);
    }

    public static Double AreaRetangulo(double A, double B) {
        return A * B;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14159;
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double resultadoAreaTrianguloRetangulo = AreaTriangulo(A, C);
        double resultadoAreaCirculo = AreaCirculo(C, pi);
        double resultadoAreaTrapezio = AreaTrapezio(A, B, C);
        double resultadoAreaQuadrado = AreaQuadrado(B);
        double resultadoAreaRetangulo = AreaRetangulo(A, B);

        System.out.printf("TRIANGULO: %.3f\n", resultadoAreaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", resultadoAreaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", resultadoAreaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", resultadoAreaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", resultadoAreaRetangulo);

    }

}
