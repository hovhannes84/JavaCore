package chepter7.test3;

public class Test {
    int a;
    Test(int i){
        a = i;
    }
    Test incrByTen (){
        Test temp = new Test(a + 10);
        return temp;
    }
}
