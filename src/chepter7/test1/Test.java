package chepter7.test1;

public class Test {
    int a,b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void  math(Test o){
        o.a *=2;
        o.b /=2;
    }

}
