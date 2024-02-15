package ProjectGame.Data;

import java.util.Scanner;

public class Monk extends CommonData {
    public Monk(){
        System.out.print("Введите имя персонажа! -> ");
        Scanner scanner = new Scanner(System.in);
        super.name = scanner.nextLine();
        super.className = "Monk";
        super.healthPoint = 80;
        super.deffence = 70;
        super.strange = 40;
        super.endurance = 60;
        super.agility = 50;
        super.intelligence = 60;
        super.faith = 90;
        super.mana = 80;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Monk: "+ name + "\n";
    }
}
