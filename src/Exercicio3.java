import java.util.Scanner;

public class Exercicio3 {

    private static double celsiusToFahnheit(double celsius) {
        double divisao = 9 / 5;
        double fahnheit = (celsius * divisao) + 32;
        return fahnheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira temperatura");
        double temp1 = sc.nextDouble();
        System.out.println("Informe a segunda temperatura");
        double temp2 = sc.nextDouble();
        double fahn1 = celsiusToFahnheit(temp1);
        double fahn2 = celsiusToFahnheit(temp2);

        System.out.printf("A temperatura %fºC são %fF\n", temp1, fahn1);
        System.out.printf("A temperatura %fºC são %fF", temp2, fahn2);

    }

}
