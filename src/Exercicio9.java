import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de provas.");
        int quantidade = sc.nextInt();
        int[] provas = new int[quantidade];

        int maiorNota = 0;
        int menorNota = 100;
        int soma = 0;

        for(int i = 0; i < quantidade; i++){
            int quantidadeDeProvas = i + 1;
            System.out.printf("Informe a nota da prova %d:", quantidadeDeProvas);
            provas[i]= sc.nextInt();

            if(provas[i] > maiorNota){
                maiorNota = provas[i];
            }
            if(provas[i] < menorNota) {
                menorNota = provas[i];
            }

        }

        for(int i = 0; i < quantidade; i++){
            soma += provas[i];
        }

        int media = soma / quantidade;

        System.out.printf("A menor nota é: %d\n", menorNota);
        System.out.printf("A maior nota é: %d\n", maiorNota);
        System.out.printf("A média é: %d", media);

    }

}
