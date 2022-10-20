import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        int result = 0;

        while( numero > 0){
            result = result + numero;
            numero--;
        }

        System.out.println(result);
    }
}
