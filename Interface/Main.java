package ProjectGame.Interface;

import java.util.ArrayList;
import java.util.List;

import ProjectGame.Data.Archer;
import ProjectGame.Data.CommonData;
import ProjectGame.Data.Coordinates;
import ProjectGame.Data.Monk;
import ProjectGame.Data.Peasant;
import ProjectGame.Data.Info.TeamCreator;

public class Main {

    public static void main(String[] args) {
        TeamCreator tk = new TeamCreator();
        Coordinates coordinates1 = new Coordinates(0, 0);
        Coordinates coordinates2 = new Coordinates(10, 10);
        ArrayList<CommonData> teamLight = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            teamLight.add(tk.teamCreator(coordinates1));
        }
        ArrayList<CommonData> teamNigth = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            teamNigth.add(tk.teamCreator(coordinates2));
        }
        System.out.println(teamLight);
        System.out.println();
        System.out.println(teamNigth);
        System.out.println();

        Coordinates archerCoordinates = new Coordinates(5, 1);
        Archer archer = new Archer(archerCoordinates);

        // Создание списка врагов
        List<CommonData> enemies = new ArrayList<>();
        enemies.add(new Archer(new Coordinates(3, 9)));
        enemies.add(new Archer(new Coordinates(7, 9)));

        // Поиск ближайшего врага
        CommonData nearestEnemy = archer.findNearestEnemy(enemies);
        System.out.println("The nearest enemy to " + archer.name + " is " + nearestEnemy.name);
    }
}
