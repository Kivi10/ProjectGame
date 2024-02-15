package ProjectGame;

public class Main {

    public static void main(String[] args) {
        clearConsole();
        CommonData bob = new Peasant();
        System.out.println(bob);
        bob.characterStatus();
        bob.characterStats();
        bob.getLvl();
        CommonData archi = new Archer();
        System.out.println(archi);
        archi.characterStatus();
        archi.characterStats();
        archi.getLvl();
        // Не заню как сделать доступ к характеристикам для пользователя закрытым =(
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
