package chepter7.test1;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("ob.a и оЬ.Ь до вызова: " + ob.a + " " + ob.b);

        ob.math(ob);
        System.out.println("ob.a и оЬ.Ь после вызова: " + ob.a + " " + ob.b);
    }
}
