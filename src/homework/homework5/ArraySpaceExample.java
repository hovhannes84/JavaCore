package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int resultLength = 0;
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        for (int i = 0; i < spaceArray.length - 1; i++) {
            if (spaceArray[i] == ' ') {
                a++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                b++;
            } else {
                break;
            }
        }
        resultLength = spaceArray.length - (a + b);
        char[] result = new char[resultLength];

        for (int i = 0; i <result.length ; i++) {
            result[i] = spaceArray[i+a];
            System.out.print(result[i]);
        }

    }
}
