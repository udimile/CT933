import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        Scanner sc = new Scanner(System.in);
        int arg = 2 - args.length;

        if (args.length > 2) {
            System.out.println("A quantidade é inválida");
            return;
        }

        for(int i = 0; i < args.length; i++){
            numeros[i] = Integer.parseInt(args[i]);
        }

        while(arg != 0){
            System.out.println("Digite um número.");
            numeros[2 - arg]= sc.nextInt();
            arg--;
        }

        int result = numeros[0] + numeros[1];
        System.out.printf("O resultado da soma é %d", result);

    }
}
