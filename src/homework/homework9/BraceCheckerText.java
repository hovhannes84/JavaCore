package homework.homework9;

public class BraceCheckerText {
    public static void main(String[] args) {
        String text = "(Hello) (from {]java}";
        BraceChecker bc = new BraceChecker(text);
        bc.check();



    }
}
