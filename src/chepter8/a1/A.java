package chepter8.a1;

class A {
    int i;

}
class B extends A{
    int i;
    B(int a,int b){
        super.i = a;
        i = b;

    }
    void show(){
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе:  " + i);
    }

}
