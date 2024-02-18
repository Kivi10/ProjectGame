package ProjectGame.Data;

// import java.util.Scanner;

public class Warrior extends CommonData {

    public Warrior(Coordinates coordinates){
        // System.out.print("Введите имя персонажа! -> ");
        // Scanner scanner = new Scanner(System.in);
        // super.name = scanner.nextLine();
        super(coordinates);
        super.name = getName();
        super.className = "Warrior";
        super.healthPoint = 120;
        super.deffence = 70;
        super.strange = 80;
        super.endurance = 70;
        super.agility = 60;
        super.intelligence = 30;
        super.faith = 30;
        super.mana = 0;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Warrior: "+ name + "\n";
    }
}
