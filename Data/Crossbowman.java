package ProjectGame.Data;

// import java.util.Scanner;

public class Crossbowman extends CommonData {

    public Crossbowman(Coordinates coordinates){
        // System.out.print("Введите имя персонажа! -> ");
        // Scanner scanner = new Scanner(System.in);
        // super.name = scanner.nextLine();
        super(coordinates);
        super.name = getName();
        super.className = "Crossbowman";
        super.healthPoint = 80;
        super.deffence = 40;
        super.strange = 50;
        super.endurance = 60;
        super.agility = 80;
        super.intelligence = 50;
        super.faith = 30;
        super.mana = 0;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Crossbowman: "+ name + "\n";
    }
}
