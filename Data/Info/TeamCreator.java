package ProjectGame.Data.Info;

import java.util.Random;

import ProjectGame.Data.Archer;
import ProjectGame.Data.CommonData;
import ProjectGame.Data.Crossbowman;
import ProjectGame.Data.Coordinates;
import ProjectGame.Data.Magician;
import ProjectGame.Data.Monk;
import ProjectGame.Data.Peasant;
import ProjectGame.Data.Spearman;
import ProjectGame.Data.Warrior;
import ProjectGame.Data.Witch;


public class TeamCreator extends CommonData {
    
    Coordinates coordinates;

    public TeamCreator() {
        super();
    }

    public CommonData teamCreator(Coordinates coordinates){
        int rnd = new Random().nextInt(1,9);
        if (rnd == 1) {return new Archer(coordinates);}
        if (rnd == 2) {return new Crossbowman(coordinates);}
        if (rnd == 3) {return new Magician(coordinates);}
        if (rnd == 4) {return new Monk(coordinates);}
        if (rnd == 5) {return new Peasant(coordinates);}
        if (rnd == 6) {return new Spearman(coordinates);}
        if (rnd == 7) {return new Warrior(coordinates);}
        if (rnd == 8) {return new Witch(coordinates);}
        return null;
    }
}
