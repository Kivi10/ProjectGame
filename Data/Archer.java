package ProjectGame.Data;

import java.util.List;

// import java.util.Scanner;

public class Archer extends CommonData {

    public Archer(Coordinates coordinates){
        // System.out.print("Введите имя персонажа! -> ");
        // Scanner scanner = new Scanner(System.in);
        // super.name = scanner.nextLine();
        super(coordinates);
        super.name = getName();
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

    // Метод для поиска ближайшего противника
    public CommonData findNearestEnemy(List<CommonData> enemies) {
        CommonData nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (CommonData enemy : enemies) {
            double distance = this.coordinates.calculateDistance(enemy.coordinates);
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        return nearestEnemy;
    }
}
