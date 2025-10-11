public class Tabuada2 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.println("\nTabuada do " + n);
            for (int i = 0;i <= 10; i++){
                System.err.println(n + " x " + i + " = " +(n * i) );
           }
            n ++;
        }
       
     
    }

}
