package ProjectGame.Data;

import java.util.Scanner;

public class Peasant extends CommonData {
    public Peasant(){
        System.out.print("Введите имя персонажа! -> ");
        Scanner scanner = new Scanner(System.in);
        super.name = scanner.nextLine();
        super.className = "Peasent";
        super.healthPoint = 70;
        super.deffence = 70;
        super.strange = 60;
        super.endurance = 60;
        super.agility = 50;
        super.intelligence = 40;
        super.faith = 90;
        super.mana = 0;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Peasant: "+ name;
    }
}
