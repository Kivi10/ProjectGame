package ProjectGame.Data;

// import java.util.Scanner;

public class Spearman extends CommonData {

    public Spearman(Coordinates coordinates){
        // System.out.print("Введите имя персонажа! -> ");
        // Scanner scanner = new Scanner(System.in);
        // super.name = scanner.nextLine();
        super(coordinates);
        super.name = getName();
        super.className = "Spearman";
        super.healthPoint = 90;
        super.deffence = 70;
        super.strange = 80;
        super.endurance = 80;
        super.agility = 70;
        super.intelligence = 50;
        super.faith = 30;
        super.mana = 0;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Spearman: "+ name + "\n";
    }
}
