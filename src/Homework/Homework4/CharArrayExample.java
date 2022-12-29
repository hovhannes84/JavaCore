package Homework.Homework4;

public class CharArrayExample {
    public static void main(String[] args) {

        int quantity = 0;
        char c = 'o';
        char[] chars = {'a', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == c) {
                quantity++;
            }
        }
        System.out.println("c-փոփոխականից մեր մասիվի մեջ " + quantity + " հատ կա ");


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        System.out.print("մեջտեղի 2 սինվոլները " + chars2[chars2.length / 2 - 1] + " և ");
        System.out.println(chars2[chars2.length / 2 + 1]);


        boolean b = true;

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        for (int i = 0; i < chars3.length; i++) {
            if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
                b = true;

            } else {
                System.out.println(false);
            }

        }
        System.out.println("մասիվը վերջանում է l y-ով " + b);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        System.out.print("մասիվի այն սինվոլները որոնք պռաբել չեն  ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);

            }

        }


    }

}
