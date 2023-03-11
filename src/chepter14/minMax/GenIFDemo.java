package chepter14.minMax;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inams [] = {3,6,2,8,6};
        Character chs [] ={'b','r','p','w'};

        MyClass<Integer> iOb = new MyClass<>(inams);
        MyClass<Character> cOb = new MyClass<>(chs);
        System.out.println("Maкcимaльнoe значение в массиве inums:  " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iOb.min());
        System.out.println("Maкcимaльнoe значение в массиве chs: " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chs: " + cOb.min());
    }
}
