package homework.homework8;

public class Test {
    public static void main(String[] args) {

        int[] arrey = {15,2,4,5,6,8,7};
        int [] extend = new int [arrey.length + 10];
        for (int i = 0; i <arrey.length ; i++) {
          extend[i] = arrey[i];
        }
        arrey = extend;
        for (int x : arrey) {
            System.out.println(x);

        }

    }
    Test test1 = new Test();

    private void extend(){
        System.out.println("barev");
    }


}
