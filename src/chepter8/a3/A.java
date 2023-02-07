package chepter8.a3;

class A {
 int i,j;
 A(int a,int b){

 }
 void  show(){
     System.out.println("i и j: " + i + " "+ j);
 }
}
class B extends A{
    int k;
    B(int a,int b ,int c){
        super(a,b);
        k = c;
    }
    void show(){
        System.out.println("k " + k);
    }
}
