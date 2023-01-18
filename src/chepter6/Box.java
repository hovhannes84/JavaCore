package chepter6;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w,double h,double d){
        System.out.println("Koнcтpyиpoвaниe объекта Вох ");
        width =w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}
