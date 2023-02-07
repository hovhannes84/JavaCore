package chepter8.a2;

class A {
    A(){
        System.out.println("B конструкторе А. ");
    }

}
class B extends  A{
    B(){
        System.out.println("B конструкторе B .");
    }

}
class C extends  B{
    C(){
        System.out.println("B конструкторе С. ");
    }
}
