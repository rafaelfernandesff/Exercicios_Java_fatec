import java.util.Scanner;

public class ExtraindoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um inteiro: ");
        n = sc.nextInt();

        while (n > 0) {
            System.out.println(n%10);
            n = n / 10;
        }


        sc.close();
    }
}
