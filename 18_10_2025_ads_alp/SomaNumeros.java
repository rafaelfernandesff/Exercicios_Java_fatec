import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cont = 0;

        do{
            System.out.println("Digite numeros até digitar -1");
            numero = sc.nextInt();
            if(numero != -1){
                cont++;
            }
        } while(numero != -1);

        // ao inves do if dentro do do while pode usar cont -1 (Gambiarra)

        System.out.println(cont);

        //O codigo a seguir utiliza o teste no inicio, eliminando o teste interno

        cont = 0;
        System.out.println("Digite a seguencia, -1 encerra");
        numero = sc.nextInt();
        while (numero != -1) {
            cont++;
            System.out.println("Digite a seguencia, -1 encerra");
            numero = sc.nextInt();
        }

        System.out.println(cont);
        
        sc.close();
    }
}
