package ProjectGame.Data;

import java.util.Random;

public abstract class CommonData{
    // int id;    
    int level = 1;
    int expirience = 0;

    public int healthPoint;
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
        }else{System.out.println("Character dead");}
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
        System.out.println("Level: " + level + "\n" + "Expirience: " + expirience + "\n");
    }

    @Override
    public String toString() {
        return className + ": " + name;
    }

    public void attack(CommonData target){
        int damage = this.strange / 2;
        target.checkDeath(damage);
    }
    public void checkDeath(int damage){
        this.healthPoint -= damage;
        if (this.healthPoint <= 0) {
            System.out.println(this.name + " dead" + "\n");
        }
    }
    public void healing(){
        int heallingPoints = new Random().nextInt(10,20);
        this.healthPoint += heallingPoints;
    }
    public void getExp(){
        this.expirience += new Random().nextInt(5,15);
        double lvlUp = 50;
        if (this.expirience >= lvlUp) {
            this.level += 1;
            lvlUp *= 1.5;
            this.expirience = 0;
        }
    }
}
