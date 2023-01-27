package homework.homework9;


public class BraceChecker {

    private String text;

    public BraceChecker(String t) {
        text = t;

    }

    public void check() {
        Stack mystek = new Stack();
        char b;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case '(':
                    mystek.push(c);
                    break;
                case '{':
                    mystek.push(c);
                    break;
                case '[':
                    mystek.push(c);
                    break;
                case ')':
                    b = (char) mystek.pop();
                    if (b != '(') {
                        System.out.println("Error: opened " + b + " but closed " + c + "at " + i);
                    }
                    break;
                case '}':
                    b = (char) mystek.pop();
                    if (b != '{') {
                        System.out.println("Error: opened " + b + " but closed " + c + "at " + i);
                    }
                    break;
                case ']':
                    b = (char) mystek.pop();
                    if (b != '[') {
                        System.out.println("Error: opened " + b + " but closed " + c +  "at " + i);
                    }
                    break;


            }


        }

    }


}
