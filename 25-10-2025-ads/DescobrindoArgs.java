public class DescobrindoArgs {
    public static void main(String[] args) {
        System.out.println("Veja o conteudo do vetor args:");
        for (int i = 0; i < args.length; i++){
            System.out.println("posicao " + i + ": " + args[i]);
        }
    }
}
