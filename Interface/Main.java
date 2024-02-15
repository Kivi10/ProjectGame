package ProjectGame.Interface;

import ProjectGame.Data.Archer;
import ProjectGame.Data.CommonData;
import ProjectGame.Data.Peasant;

public class Main {

    public static void main(String[] args) {
        clearConsole();
        Peasant bob = new Peasant();
        System.out.println(bob);
        bob.getLvl();
        CommonData archi = new Archer();
        System.out.println(archi);
        
        bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);bob.attack(archi);
        bob.getLvl();
        archi.getLvl();
        archi.characterStats();
    }
    
    static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
