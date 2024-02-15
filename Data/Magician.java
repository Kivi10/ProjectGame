package ProjectGame;

import java.util.Scanner;

import ProjectGame.Data.CommonData;

public class Magician extends CommonData {

    public Magician (){
        System.out.print("Введите имя персонажа! -> ");
        Scanner scanner = new Scanner(System.in);
        super.name = scanner.nextLine();
        super.healthPoint = 70;
        super.deffence = 20;
        super.strange = 40;
        super.endurance = 40;
        super.agility = 50;
        super.intelligence = 90;
        super.faith = 50;
        super.mana = 100;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Magician: "+ name;
    }
}
