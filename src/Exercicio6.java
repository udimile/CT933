import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação deseja realizar? (opções: + - / *)");
        String operacao = sc.nextLine();
        if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("/") && !operacao.equals("*")){
            System.out.println("Operação desconhecida");
            return;
        }

        System.out.println("Informe o primeiro número.");
        double numero1 = sc.nextInt();
        System.out.println("Informe o segundo número.");
        double numero2 = sc.nextInt();

        double result = 0;

        switch (operacao){
            case "+" -> result = numero1 + numero2;
            case "-" -> result = numero1 - numero2;
            case "/" -> result = numero1 / numero2;
            case "*" -> result = numero1 * numero2;
        }

        System.out.printf("O resultado da operação é %d.", result);

    }
}
