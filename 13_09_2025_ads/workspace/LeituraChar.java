import java.util.Scanner;

public class LeituraChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char letra1 = s.charAt(0);
        System.out.println("a primeira letra eh" + " " + letra1);
        
        int posicao = sc.nextInt();
        if (posicao < s.length() && posicao >= 0){
            char outraletra = s.charAt(posicao);

            System.out.println("a letra da possicao"+ posicao + " " + "eh" + " " + outraletra);
        }
        else{
            System.err.println("Ta maluco tem tudo isso de letra nao");
        }

        sc.close();

    }

}
