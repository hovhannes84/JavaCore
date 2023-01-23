package homework.homework8;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {

        if (size >= array.length - 1) {
            extend();
            array[size++] = value;
        }
        array[size++] = value;

    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] extend = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            extend[i] = array[i];
        }
        array = extend;

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        } else
            return array[index];

    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

    }

    //ջնջել մասիվի index-երորդ էլեմենտը
    //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("չկա նման էլեմենտ");
            return;
        }
        for (int i = index; i < size; i++) {
            array[index] = array[index + 1];
            index++;
        }
        size--;

    }

    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
    //Հին արժեքը կկորի
    //եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։

    public void set(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("նման ինդեքսով էլեմենտ չկա");
            return;
        }
        array[index] = value;

    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
    //Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("նման ինդեքսով էլեմենտ չկա");
            return;

        }
        size++;
        int s = size;
        for (int i = index; i < size; i++) {
            array[s] = array[s - 1];
            s--;
        }
        array[index] = value;

    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {

        return value > size || value < 0;

    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
    //եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void print1() {
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
    }


}
