package chepter9.intStack;

public class DynStack implements IntStack {
    private int stek[];
    private int tos;

    DynStack(int size){
        stek = new  int[size];
        tos = -1;
    }
    public void push(int item){
        if (tos == stek.length-1){
            int temp [] = new  int[stek.length * 2];
            for (int i = 0; i <stek.length ; i++) {
                temp[i] = stek[i];
            }
            stek = temp;
            stek[++tos] = item;

        }else {
            stek[++tos] = item;
        }
    }
    public  int pop(){
        if (tos <0){
            System.out.println("Cтeк не загружен. ");
            return 0;
        }else return stek[--tos];
    }
}
