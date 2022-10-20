import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota prova 1:");
        double notaUm = sc.nextDouble();
        System.out.println("Informe a nota prova 2:");
        double notaDois = sc.nextDouble();
        System.out.println("Informe a nota prova 3:");
        double notaTres = sc.nextDouble();
        System.out.println("Informe a nota prova 4:");
        double notaQuatro = sc.nextDouble();

        if (notaUm > 10 || notaDois > 10 || notaTres > 10 || notaQuatro > 10) {
            System.out.println("valor é inválido");
        } else if (notaUm < 0 || notaDois < 0 || notaTres < 0 || notaQuatro < 0) {
            System.out.println("valor é inválido");
        } else {
            double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
            System.out.println("A média do aluno foi " + media);
        }
    }
}