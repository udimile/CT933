import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua altura em metros?");
        double altura = sc.nextDouble();
        System.out.println("Qual seu peso em quilos?");
        double peso = sc.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 17) {
            System.out.println("Imc " + IMC + " Muito abaixo do peso.");
        } else if (IMC > 17 && IMC < 18.49) {
            System.out.println("Imc " + IMC + " Abaixo do peso.");
        } else if (IMC > 18.50 && IMC < 24.99) {
            System.out.println("Imc " + IMC + " Peso normal.");
        } else if (IMC > 25 && IMC < 29.99) {
            System.out.println("Imc " + IMC + " Acima do Peso.");
        } else if (IMC > 30 && IMC < 34.99) {
            System.out.println("Imc " + IMC + " Obesidade I.");
        } else if (IMC > 35 && IMC < 39.99) {
            System.out.println("Imc " + IMC + " Obesidade II (severa)");
        } else {
            System.out.println("Imc " + IMC + " Obesidade III (mórbida)");
        }


    }
}