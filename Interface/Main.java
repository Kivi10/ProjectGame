package ProjectGame.Interface;

import ProjectGame.Data.Archer;
import ProjectGame.Data.CommonData;
import ProjectGame.Data.Monk;
import ProjectGame.Data.Peasant;

public class Main {

    public static void main(String[] args) {
        clearConsole();
        Peasant bob = new Peasant();
        System.out.println(bob);
        bob.getLvl();
        Archer archi = new Archer();
        System.out.println(archi);
        Monk mone = new Monk();
        
        bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);
        bob.getLvl();
        archi.getLvl();
        archi.characterStats();
        mone.healing(archi);mone.healing(archi);mone.healing(archi);
        archi.characterStats();
    }
    
    static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
