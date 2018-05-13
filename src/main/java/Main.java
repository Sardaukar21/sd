import character.Adept;
import character.Guard;
import character.IPers;
import character.Pers;

public class Main {

    //ТОчка запуска программы
    public static void main(String[] args) {
//        String one = "1";
//        String two = "2";
//        System.out.println(one + two);
//
//        int intOne = 1;
//        int intTwo = 2;
//        System.out.println(intOne + intTwo);

        Pers den = new Guard("Den");
//        System.out.println(den.name + ": " + den.getStat());

        Pers nigga = new Adept("Nigga");


        System.out.println(nigga.getName() +": " + nigga.getStat() + "\n" + den.getName() + ":" + den.getStat());
    }

}
