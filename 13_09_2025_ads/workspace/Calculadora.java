import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resutado;
        char operacao;

        System.out.println("Digite o primeiro numero:");
        double numero1 = sc.nextDouble();

        System.out.println("Qual a operacao");
        sc.nextLine();
        operacao = sc.nextLine().charAt(0);

        System.out.println("Digite o segundo numero:");
        double numero2 = sc.nextDouble();
        
        if (operacao == '+'){
            resutado = numero1 + numero2;
            System.err.println("Resultado: " + resutado);
        }
        else if (operacao == '-'){
            resutado = numero1 - numero2;
            System.out.println("Resultado: " + resutado);
        }
        else if (operacao == '*'){
            resutado = numero1 * numero2;
            System.err.println("Resultado: " + resutado);
        }
        else if (operacao == '/'){
            if (numero2 == 0){
                System.out.println("erro");
            }
            else{
                resutado = numero1 / numero2;
                System.out.println("Resultado: " + resutado);
            }
        }
        else{
            System.out.println("Operacao invalida");
        }

        sc.close();
    }
}
