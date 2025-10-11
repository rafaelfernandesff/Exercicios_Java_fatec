import java.util.Scanner;

public class ImparFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro possitivo:");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Digite um numero inteiro possitivo:");
            n = sc.nextInt();
            
        }
        sc.close();

        System.out.println("\nVeja os" + n + "primeiros impares;" );
        int impar = 1;
        for(int i = 1; i <= n; i ++){
            System.out.print(impar +" ");
            impar = impar + 2;
        }

    }
}
