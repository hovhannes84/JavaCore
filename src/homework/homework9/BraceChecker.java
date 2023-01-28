package homework.homework9;


public class BraceChecker {

    private String text;

    public BraceChecker(String t) {
        text = t;

    }

    public void check() {
        Stack mystek = new Stack();
        char b;
        int a=0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);


            switch (c) {
                case '(':
                case '{':
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
        for (int i = 0; i <text.length() ; i++) {
            char c = text.charAt(i);
            switch (c){
                case '(':
                case '{':
                case '[':
                case ')':
                case '}':
                case ']':
                    mystek.push(c);
                    a++;
            }
            if (i == text.length()-1 && a % 2 != 0 ){
                if (c == '('||c == '{' ||c == '['){
                    System.out.println( "Error: at " + i + " Opened "  + c + " but not closed. " );
                }else System.out.println("Error at " + i + " index Closed " + c +" but not open." );


            }
        }


    }


}
