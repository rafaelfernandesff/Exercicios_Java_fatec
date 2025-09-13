import java.util.Scanner;

public class MaiorouIgual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Sao iguais");
        }
        else if (num1 < num2){
            System.out.println(num2 + " eh maior");
        }
        else{
            System.out.println(num1 + " eh o maior");
        }
        
        
        sc.close();
    }

}
