import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$.");
        double valorInicial = sc.nextDouble();
        System.out.println("Informe o juros ao mês em %.");
        double jurosAoMes = sc.nextDouble();
        System.out.println("Informe o tempo em meses que seu dinheiro ficará investido");
        int tempoEmMeses = sc.nextInt();
        double juros;
        double soma ;

        for (int i = 0; i < tempoEmMeses; i++){
            juros = valorInicial * jurosAoMes / 100;
            soma = valorInicial + juros;
            System.out.printf("Mês %d: Juros: R$ %.2f, saldo: %.2f%n", i + 1, juros, soma );
        }
    }
}
