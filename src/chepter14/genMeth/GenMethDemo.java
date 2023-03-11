package chepter14.genMeth;

public class GenMethDemo {
    static <T extends Comparable<T> ,V extends T> boolean isIn(T x,V [] y){
        for (int i = 0; i <y.length ; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Integer nams [] = {1,2,3,4,5};
        if (isIn(2,nams)){
            System.out.println("Чиcлo 2 содержится в массиве num");
        }
        if (!isIn(7,nams)){
            System.out.println("Чиcлo 7 отсутствует в массиве num");
        }
        System.out.println();

        String strs [] =  {"один","два","три","четыре","пять"};
        if (isIn("два",strs)){
            System.out.println("два содержится в массиве strs");
        }
        if (!isIn("ceмь",strs)){
            System.out.println("ceмь отсутствует в массиве strs");
        }
    }

}
