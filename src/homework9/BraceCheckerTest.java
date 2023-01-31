package homework9;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "(H[e[l]l}o) (from} [Java)";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}





