package chepter9.myIf;

public interface MyIF {

    int getNamber();

    default String getString(){
        return "Объект типа String по умолчанию";
    }
}
