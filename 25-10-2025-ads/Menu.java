import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("escolha uma opcao: ");
            System.out.print("1 - soma\n2 - mutiplica\n3 - subtrai\n4 - divide\n0 - sai --> ");
            opcao =  sc.nextInt();

            int numero1 = 0, numero2 = 0;

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
                System.out.print("Digite o primeiro numero: ");
                numero1 =  sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                numero2 = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    System.out.println("soma = " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("multiplicacao = " + numero1 * numero2);
                    break;
                case 3:
                    System.out.println("subtracao = " + (numero1 - numero2));
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("nao existe divisao por zero");
                    }
                    else{
                        System.out.println("divisao = " + (numero1 / numero2));
                    }
                    break;
                case 0:
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
        }
    } while (opcao != 0);
        sc.close();
    }
}
