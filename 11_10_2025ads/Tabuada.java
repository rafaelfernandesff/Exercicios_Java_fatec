import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0;i <= 10; i++){
            System.err.println(n + " x " + i + " = " +(n * i) );
        }

    }

}
