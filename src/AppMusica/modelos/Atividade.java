package AppMusica.modelos;

public class Atividade {
    public static void main(String[] args) {
        int r = 1, s = 2, x = 0;

        for (int i = 0; i <= 2; i++) {
            x = ++r + r++ + i;
        }

        System.out.println("Total: %d".formatted(x));
    }
}
