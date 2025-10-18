import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, pares = 0;

        do {
            System.out.print("Digite um numero par ");
            numero = sc.nextInt();
        } while(numero%2 == 1);
        
        do{
            System.out.print(pares + " ");
            pares = pares + 2;
        }while(pares <= numero);

        sc.close();
    }
    
}
