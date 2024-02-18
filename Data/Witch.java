package ProjectGame.Data;

// import java.util.Scanner;

public class Witch extends CommonData {
    public Witch(){
        // System.out.print("Введите имя персонажа! -> ");
        // Scanner scanner = new Scanner(System.in);
        // super.name = scanner.nextLine();
        super.name = getName();
        super.className = "Witch";
        super.healthPoint = 80;
        super.deffence = 50;
        super.strange = 30;
        super.endurance = 60;
        super.agility = 50;
        super.intelligence = 60;
        super.faith = 0;
        super.mana = 80;
        super.level = 1;
        super.expirience = 0;
    }

    @Override
    public String toString() {
        return "Witch: "+ name + "\n";
    }
}
