import java.util.Scanner;

public class MaiorDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;

        do {
            System.out.print("Digite quantos numeros vc quer (inteiro possitivo): ");
            quant = sc.nextInt();
        } while(quant <= 0);

        System.out.print("Digite o primeiro valor: ");
        int n = sc.nextInt();
        int maior = n;
        int vezes = 1;

        for(int i =1; i < quant; i++){
            System.out.print("Digite o proximo numero: ");
            n = sc.nextInt();
            if (n > maior){
                maior = n;
                vezes = 1;
            } else if (n == maior){
                vezes++;
            }

        }

        System.out.println("o maior valor eh: " + maior);
        System.out.println("ele apareceu: " + vezes + " vezes"); 

        sc.close();
    }
}
