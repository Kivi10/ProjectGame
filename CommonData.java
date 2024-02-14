package ProjectGame;

import java.util.Random;

abstract class CommonData{
    int id;    
    int level = 1;
    int expirience = 0;

    int healthPoint = new Random().nextInt(100, 150);
    int damage;
    int deffence;
    int strange;
    int stamina;
    int speed;
    int agility;

    String name;
    String className;

    String weapon;
    String inventory;

    protected void characterStatus(){
        System.out.println("ID: "+ id + "; Class: " + className + "; Name: " + name + "; Level:" + level);
    }

    protected CommonData createCharacter(String type, String name) {
        this.name = name;
        if (type.equalsIgnoreCase("peasant")) {
            return new Peasant();
        }if (type.equalsIgnoreCase("archer")) {
            return new Archer();
        }if (type.equalsIgnoreCase("crossbowman")) {
            return new Crossbowman();
        }if (type.equalsIgnoreCase("magician")) {
            return new Magician();
        }if (type.equalsIgnoreCase("monk")) {
            return new Monk();
        }if (type.equalsIgnoreCase("spearman")) {
            return new Spearman();
        }if (type.equalsIgnoreCase("warrior")) {
            return new Warrior();
        }if (type.equalsIgnoreCase("witch")) {
            return new Witch();
        }else{return null;}
    }
    
    protected void attack(int damage){
        if (this.healthPoint > 0) {
            this.healthPoint -= damage;  
        }
        if (this.healthPoint <= 0) {
            System.out.println("You dead!");
        }
    }
    protected void healing(){
        int heallingPoints = new Random().nextInt(10,20);
        this.healthPoint += heallingPoints;
    }
    protected void getExp(){
        this.expirience += new Random().nextInt(5,15);
        double lvlUp = 50;
        if (this.expirience >= lvlUp) {
            this.level += 1;
            lvlUp *= 1.5;
            this.expirience = 0;
        }
    }
}
