package homework.homework9;

public class Stack {
    private int stck[] =new int[10];
    private int tos;

    Stack(){
        tos = -1;
    }
    void push (int item){
        if (tos == 9){
            System.out.println("Cтeк заполнен .");
        }else {
            stck[++tos]= item;
        }
    }
    int pop(){
        if (tos<0){
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
