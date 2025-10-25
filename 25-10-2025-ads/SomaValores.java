import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] v = new int[10];

        for(int i = 0; i < v.length; i++){
            System.out.print("Digite o valor da posicao " + i + ": ");
            v[i] = sc.nextInt();
            soma = soma + v[i];
        }

        System.out.println("A soma dos valores eh: " + soma);

        sc.close();
    }
}
