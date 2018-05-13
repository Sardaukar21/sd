package character;

public abstract class Pers {

    private String name;

    Pers(String text) {
        name = text;
//        int weaponSkill=0;
//        int ballisticSkill=0;
//        int strength=0;
//        int toughness=0;
//        int agility=0;
//        int intelligence=0;
//        int perception=0;
//        int willpower=0;
//        int fellowship=0;
    }

    private String stats  {
        int weaponSkill=0;
        int ballisticSkill=0;
        int strength=0;
        int toughness=0;
        int agility=0;
        int intelligence=0;
        int perception=0;
        int willpower=0;
        int fellowship=0;
    }

    public abstract void statGenerate();
    public String getStat(){
        return "Weapon Skill -" + weaponSkill;
        return "Ballistic Skill -" + ballisticSkill;
        return "Strength -" + strength;
        return "Toughness -" + toughness;
        return "Agility -" + agility;
        return "Intelligence -" + intelligence;
        return "Perception -" + persception;
        return "Willpower -" + willpower;
        return "Fellowship -" + fellowship;

    }

    public String getName() {
        return "Имя " + name;
    }
}
