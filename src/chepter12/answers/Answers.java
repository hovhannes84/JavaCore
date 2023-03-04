package chepter12.answers;

import java.util.Random;

public enum Answers {
    NO,YES,MAYBE,LATER,SOON,NEVER
}
class Question{

    Random random = new Random();

    Answers ask(){
        int prob = (int)(100* random.nextDouble());
        if (prob < 15){
            return Answers.MAYBE;
        }else if (prob< 30 ){
            return  Answers.NO;
        }else if (prob < 60){
            return Answers.YES;
        }else if (prob <75){
            return Answers.LATER;
        }else if (prob <98){
            return Answers.SOON;
        }else {
            return Answers.NEVER;
        }
    }
}
class AskМe{
    static void answer (Answers result){
        switch (result){
            case NO:
                System.out.println("Heт");
                break;
            case YES:
                System.out.println("Дa");
                break;
            case MAYBE:
                System.out.println("Boзмoжнo");
                break;
            case LATER:
                System.out.println("Пoзднee");
                break;
            case SOON:
                System.out.println("Bcкope");
                break;
            case NEVER:
                System.out.println("Hикoгдa");
        }

    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
