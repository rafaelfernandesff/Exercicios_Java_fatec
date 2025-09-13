import java.util.Scanner;

public class ChuteLetra {
    public static void main(String[] args) {
        char misterios =  'r';
        Scanner sc = new Scanner(System.in);

        System.out.println("Tenta acertar a letra ai");
        String s = sc.nextLine();

        if(misterios == s.charAt(0)){
            System.out.println("Acertou");
        }
        else {
            System.err.println("errou");
        }

        sc.close();
    }

}
