package chepter8.box1;

class BoxWeight extends Box {
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        m = weight;
    }
    BoxWeight (){
        super();
        weight = -1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight = m;
    }

}