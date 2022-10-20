

public class Exercicio4 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento");
            return;
        }
        int numero = Integer.parseInt(args[0]);

        if (numero % 2 == 0) {
            System.out.printf("O número %d é positivo.", numero);
        } else {
            System.out.printf("O numero %d é impar", numero);
        }

    }
}
