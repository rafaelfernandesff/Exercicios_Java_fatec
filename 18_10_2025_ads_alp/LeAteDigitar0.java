import java.util.Scanner;

public class LeAteDigitar0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite sua seguencia de numeros, 0 encerra:");
            numero = sc.nextInt();
        } while(numero != 0);

        sc.close();
    }

}
