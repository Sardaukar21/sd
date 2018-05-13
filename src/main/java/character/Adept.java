package character;

import java.util.Random;

public class Adept extends Pers {


    int willPower=0;
    int fellowship=0;
    int toughness=0;


    public Adept (String text) {
        super(text);
    }


    public String getStat (){
        return "Will Power = "+willPower+" Fellowship = "+fellowship+" Toughness = "+toughness;

    }

    /*default*/ int getRandomInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound) + bound;
    }

//    public String getName (){
//        String adeptName="Имя " + name;
//        return adeptName;
//
//    }

//    public String getName (){
//        return "Имя " + name;
//    }

    public void statGenerate() {

    }
}
