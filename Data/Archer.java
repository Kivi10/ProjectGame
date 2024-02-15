package ProjectGame.Data;

import java.util.Scanner;

public class Archer extends CommonData {

    public Archer(){
        System.out.print("Введите имя персонажа! -> ");
        Scanner scanner = new Scanner(System.in);
        super.name = scanner.nextLine();
        super.className = "Archer";
        super.healthPoint = 80;
        super.deffence = 40;
        super.strange = 60;
        super.endurance = 50;
        super.agility = 70;
        super.intelligence = 40;
        super.faith = 30;
        super.mana = 0;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Archer: "+ name + "\n";
    }
}
