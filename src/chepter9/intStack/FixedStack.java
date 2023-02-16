package chepter9.intStack;

public class FixedStack  implements IntStack{
    private int stek[];
    private int tos;
    FixedStack (int size){
        stek = new int[size];
        tos = -1;

    }
    public void push(int item){
        if (tos == stek.length-1){
            System.out.println("Cтeк заполнен. ");
        }else {
            stek[++tos] = item;

        }
    }
    public int pop(){
        if (tos < 0){
            System.out.println(" Cтeк не загружен. ");
            return 0;
        } else {
            return stek[--tos];
        }
    }

}
