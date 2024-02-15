package ProjectGame.Interface;

import ProjectGame.Data.Archer;
import ProjectGame.Data.CommonData;
import ProjectGame.Data.Peasant;

public class Main {

    public static void main(String[] args) {
        clearConsole();
        Peasant bob = new Peasant();
        System.out.println(bob);
        bob.characterStatus();
        bob.characterStats();
        bob.getLvl();
        CommonData archi = new Archer();
        System.out.println(archi);
        archi.characterStatus();
        archi.characterStats();
        archi.getLvl();
        
        archi.healthPoint = 100;
        archi.characterStats(); 
        
        bob.attack(archi);
        archi.characterStats();
    }
    
    static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
