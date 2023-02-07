package chepter8.bох;

public class Box {
    double width;
    double heigth;
    double depht;

    Box (Box ob){
        width = ob.width;
        heigth = ob.heigth;
        depht = ob.depht;

    }
    Box (double w,double h, double d){
        width = w;
        heigth = h;
        depht = d;
    }
    Box(){
        width = -1;
        heigth = -1;
        depht = -1;

    }
    Box(double len){
        width = heigth = depht = len;
    }
    double volume(){
        return width * heigth * depht;
    }
}
