package chepter8.figure1;

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("B области треугольника. ");
        return dim1 * dim2 / 2;
    }
}
