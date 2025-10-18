import java.util.Scanner;

public class DivididoPor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0;

        System.out.print("Digite um inteiro: ");
        n = sc.nextInt();
        int copia = n;

        while (n > 0) {
            soma += n%10;
            n = n / 10;
        }

        if (soma%3 == 0){
            System.out.println(copia + " Eh divisivel por 3");
        }else {
            System.out.println(copia + " Nao eh divisivel por 3");
        }

        sc.close();
    }

}
