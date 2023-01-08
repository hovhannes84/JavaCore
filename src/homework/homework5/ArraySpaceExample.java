package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        int spacesStart = 0;
        int spacesFinish = 0;
        int resultLength = 0;
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        for (int i = 0; i < spaceArray.length - 1; i++) {
            if (spaceArray[i] == ' ') {
                spacesStart++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                spacesFinish++;
            } else {
                break;
            }
        }
        resultLength = spaceArray.length - (spacesStart + spacesFinish);
        char[] result = new char[resultLength];

        for (int i = 0; i <result.length ; i++) {
            result[i] = spaceArray[i+spacesStart];
            System.out.print(result[i]);
        }

    }
}
