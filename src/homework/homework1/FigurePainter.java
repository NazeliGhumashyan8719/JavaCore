package homework.homework1;

public class FigurePainter {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static class FigurePainter1 {

        public static void main(String[] args) {
            for (int i = 0; i <= 4; i++) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}




