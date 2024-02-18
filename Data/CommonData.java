package ProjectGame.Data;

import java.util.Random;

public abstract class CommonData{
    // int id;    
    int level = 1;
    int expirience = 0;

    int healthPoint;
    int deffence;
    int strange;
    int endurance;
    int agility;
    int intelligence;
    int faith;
    int mana;

    String name;
    String className;

    String weapon;
    String inventory;

    public void characterStatus(){
        if (this.healthPoint>0) {
            System.out.println("Class: " + className + "; Name: " + name + "; Level:" + level + "\n");
        }else{System.out.println("Character dead" + "\n");}
    }
   
    public void characterStats(){
        System.out.println(
        "Health: " + healthPoint + ";" +"\n"+
        "Diffence: " + deffence + ";"+ "\n"+
        "Strange:" + strange + ";"+ "\n"+
        "Endurance: " + endurance + ";"+ "\n"+
        "Agility: " + agility + ";"+ "\n"+
        "Intelligence: " + intelligence + ";"+ "\n"+
        "Faith: " + faith + ";"+ "\n"+
        "Mana: " + mana + "\n");
    }

    public void getLvl(){
        System.out.println(name + "\n" +"Level: " + level + "\n" + "Expirience: " + expirience + "\n");
    }

    @Override
    public String toString() {
        return className + ": " + name;
    }

    public void attack(CommonData target){
        if (target.healthPoint >= 1) {
          int damage = this.strange / 2;
            if (target.checkDeath(damage) == true) {
                expUp(target.level);  
        }
        }else{System.out.println("Target dead!" + "\n");}
    }
    
    protected boolean checkDeath(int damage){
        this.healthPoint -= damage;
        if (this.healthPoint <= 0) {
            System.out.println(this.name + " dead" + "\n");
            return true;
        }
        return false;
    }
    
    protected void healing(CommonData target){
        int heallingPoints = level*10;
        target.healthPoint += heallingPoints;
    }

    protected void expUp(int lvl){
        this.expirience += 100;
        double lvlUp = 50;
        while (this.expirience >= lvlUp) {
            this.level += 1;
            lvlUp *= 1.5;
            expirience -= lvlUp;
        }
    }

    protected static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);  
    }
}
