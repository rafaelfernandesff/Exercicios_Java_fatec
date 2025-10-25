import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        int[] v;

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        v = new int[tamanho];

        System.out.println("Vamos preencher o vetor");
        for (int i = 0; i < v.length; i++){
            System.out.print("Digite o valor da posicao " + i + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("\nSua lista de valores:");
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        System.out.println("\nSua lista invertida: ");
        for (int i = v.length - 1; i >= 0; i--){
            System.out.print(v[i] + " ");
        }

        sc.close();
    }
}
