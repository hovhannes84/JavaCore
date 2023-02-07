package chepter8.a5;

class A {
    void callme(){
        System.out.println("B методе callme() из класса А ");

    }
}
class  B extends  A{
    void callme(){
        System.out.println("B методе callme() из класса В ");
    }

}
class C extends A{
    void  callme(){
        System.out.println("B методе callme() из класса С ");
    }
}