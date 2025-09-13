import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;

        if (media >= 6 && media <= 10){
            System.out.println("Aprovado");
        }
        else if (media >= 2 && media < 6){
            System.out.println("p3");
        }
        else if (media < 2){
            System.out.println("reprovado");
        }
        else{
            System.out.println("fora do intervalo");
        }

        
        sc.close();
    }
}
